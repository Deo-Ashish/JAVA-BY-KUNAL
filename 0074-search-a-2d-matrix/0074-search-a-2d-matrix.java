class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        // Find the possible row
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target >= matrix[mid][0] && 
                target <= matrix[mid][matrix[mid].length - 1]) {
                
                // Binary search inside the row
                int left = 0;
                int right = matrix[mid].length - 1;

                while (left <= right) {
                    int m = left + (right - left) / 2;

                    if (matrix[mid][m] == target) {
                        return true;
                    } else if (matrix[mid][m] < target) {
                        left = m + 1;
                    } else {
                        right = m - 1;
                    }
                }

                return false;
            }

            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}