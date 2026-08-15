class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[] row = new int[m];
        int[] col = new int[n];

        // Count increments for each row and column
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int oddRows = 0;
        int oddCols = 0;

        // Count odd rows
        for (int value : row) {
            if (value % 2 != 0) {
                oddRows++;
            }
        }

        // Count odd columns
        for (int value : col) {
            if (value % 2 != 0) {
                oddCols++;
            }
        }

        int evenRows = m - oddRows;
        int evenCols = n - oddCols;

        // Odd = odd row + even column OR even row + odd column
        return (oddRows * evenCols) + (evenRows * oddCols);
    }
}