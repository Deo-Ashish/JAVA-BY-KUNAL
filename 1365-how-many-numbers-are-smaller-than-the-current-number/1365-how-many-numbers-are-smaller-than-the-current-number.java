class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        // Prefix sum
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        // Build answer
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] == 0 ? 0 : freq[nums[i] - 1];
        }

        return ans;
    }
}