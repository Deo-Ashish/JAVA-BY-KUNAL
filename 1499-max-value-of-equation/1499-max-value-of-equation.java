import java.util.*;

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {

        // Stores index of points
        // in decreasing order of (y - x)
        Deque<Integer> dq = new ArrayDeque<>();

        int ans = Integer.MIN_VALUE;

        for (int j = 0; j < points.length; j++) {

            int xj = points[j][0];
            int yj = points[j][1];

            // Remove points that are outside the range k
            while (!dq.isEmpty() &&
                    xj - points[dq.peek()][0] > k) {
                dq.pollFirst();
            }

            // Best previous point is at the front
            if (!dq.isEmpty()) {
                int i = dq.peekFirst();

                ans = Math.max(ans,
                        points[i][1] - points[i][0]
                                + yj + xj);
            }

            // Maintain decreasing order of (y - x)
            while (!dq.isEmpty() &&
                    points[dq.peekLast()][1] - points[dq.peekLast()][0] <= yj - xj) {
                dq.pollLast();
            }

            dq.offerLast(j);
        }

        return ans;
    }
}
