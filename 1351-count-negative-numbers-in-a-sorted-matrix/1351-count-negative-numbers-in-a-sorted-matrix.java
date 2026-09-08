class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int i = 0;
        int j = grid[0].length - 1;
        while (i < grid.length && j >= 0) {
            if (grid[i][j] < 0) {
                count += grid.length - i;  // count negatives in this COLUMN downward
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
}