class Solution {
    public int thirdMax(int[] nums) {

        // Insertion Sort
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        int count = 1;

        // Traverse from largest to smallest
        for (int i = nums.length - 1; i > 0; i--) {

            if (nums[i] != nums[i - 1]) {
                count++;

                if (count == 3) {
                    return nums[i - 1];
                }
            }
        }

        // If 3 distinct values don't exist
        return nums[nums.length - 1];
    }
}