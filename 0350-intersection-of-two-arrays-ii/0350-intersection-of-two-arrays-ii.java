class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] freq = new int[1001];
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        // Store frequency of nums1
        for (int num : nums1) {
            freq[num]++;
        }

        int count = 0;

        // Check nums2
        for (int num : nums2) {
            if (freq[num] > 0) {
                result[count] = num;
                count++;
                freq[num]--;
            }
        }

        return java.util.Arrays.copyOf(result, count);
    }
}