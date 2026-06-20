public class RBS {
    static void main(String[] args) {
        int[] arr = {2, 2, 2, 7, 1, 2, 2};
        int target = 1;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivotForDuplicates(nums);

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

    //Find pivot in distinct array
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

    //Finding pivot for duplicates elements in an array
    public static int findPivotForDuplicates(int[] nums) {
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


            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if (nums[end - 1] > nums[end] && end > start) {
                    return end - 1;
                }
                end--;
            }
            //Left part is sorted, so pivot should be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
