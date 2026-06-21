import java.util.Arrays;

public class SearchIn2DArray {
    static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 28, 37, 39},
                {33, 34, 38, 50}
        };

        int target = 29;
        System.out.println(Arrays.toString(Search(matrix, target)));
    }

    static int[] Search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return new int[]{-1, -1};
    }
}
