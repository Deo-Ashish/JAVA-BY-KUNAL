class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int last = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[high] < target) {
                return high + 1;
            }

            else if (nums[low] > target) {
                return low;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
                last = mid;
            }

            else {
                high = mid - 1;
                last = mid;
            }
        }

        return last;
    }
}