class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    ans[count] = nums1[i];
                    count++;

                    nums2[j] = -1; // mark as used
                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(ans, count);
    }
}