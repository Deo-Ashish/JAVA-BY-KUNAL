public class FindCountOfRotatedArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        return findPivot(arr) + 1;
    }

    //use this for non duplicates
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
