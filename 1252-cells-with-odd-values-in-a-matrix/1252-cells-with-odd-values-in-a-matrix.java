class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        // int[][] matrix = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] index : indices) {
            int r = index[0];
            int c = index[1];

            row[r]++;
            col[c]++;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }

}