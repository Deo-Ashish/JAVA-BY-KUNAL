class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for (int num : nums1) {
            seen[num] = true;
        }

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;

        for (int num : nums2) {
            if (seen[num]) {
                temp[count++] = num;
                seen[num] = false;
            }
        }

        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }
}