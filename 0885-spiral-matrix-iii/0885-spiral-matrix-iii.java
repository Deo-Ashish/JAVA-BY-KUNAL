class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] ans = new int[rows * cols][2];

        int count = 0;
        int steps = 1;

        // East, South, West, North
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };

        int r = rStart;
        int c = cStart;
        int dir = 0;

        // Starting cell
        ans[count++] = new int[] { r, c };

        while (count < rows * cols) {

            // Every step length is used twice
            for (int i = 0; i < 2; i++) {

                for (int j = 0; j < steps; j++) {
                    r += dr[dir];
                    c += dc[dir];

                    // Add only if inside grid
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        ans[count++] = new int[] { r, c };
                    }
                }

                dir = (dir + 1) % 4;
            }

            steps++;
        }

        return ans;
    }
}