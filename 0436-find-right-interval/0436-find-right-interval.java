class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int n = intervals.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int best = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 0; j < n; j++) {

                if (intervals[j][0] >= intervals[i][1]) {

                    if (intervals[j][0] < best) {
                        best = intervals[j][0];
                        index = j;
                    }
                }
            }

            ans[i] = index;
        }

        return ans;
    }
}