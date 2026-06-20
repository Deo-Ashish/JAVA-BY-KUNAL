public class RBS {
    static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) { //if array is not rotated
            //then do normal binary search
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot element equal to target element
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        }

        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
