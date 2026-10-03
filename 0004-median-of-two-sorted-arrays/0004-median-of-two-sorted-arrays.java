class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            // Partition nums1
            int i = (low + high) / 2;

            // Partition nums2
            int j = (m + n + 1) / 2 - i;

            int left1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int right1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int left2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int right2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Correct partition
            if (left1 <= right2 && left2 <= right1) {

                // Odd number of elements
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                // Even number of elements
                int leftMax = Math.max(left1, left2);
                int rightMin = Math.min(right1, right2);

                return (leftMax + rightMin) / 2.0;
            }

            // We have taken too many elements from nums1
            else if (left1 > right2) {
                high = i - 1;
            }

            // We need to take more elements from nums1
            else {
                low = i + 1;
            }
        }

        return 0.0;
    }
}