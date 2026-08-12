class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            // Shift elements to the right
            for (int j = i; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            // Insert nums[i]
            target[index[i]] = nums[i];
        }

        return target;
    }
}