class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int n = intervals.length;
        int[] ans = new int[n];

        int[][] starts = new int[n][2];

        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }

        // Sort by start value
        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {

            int end = intervals[i][1];

            int low = 0;
            int high = n - 1;
            int index = -1;

            // Binary search for first start >= end
            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (starts[mid][0] >= end) {
                    index = starts[mid][1];
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            ans[i] = index;
        }

        return ans;
    }
}