class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        int i = 0;
        int bestI = 0;
        int max = Integer.MIN_VALUE;
        for (int j = 1; j < n; j++) {
            int xj = points[j][0];
            int yj = points[j][1];

            while (i < j) { // This Equlas  while( (i < j) && (xj - xi > k) )-> i++;
                int xi = points[i][0];
                if (xj - xi > k) {
                    i++;
                } else {
                    break;
                }
            }

            if (i == j) {
                bestI = i;
                continue;
            }

            if (bestI < i) {
                bestI = i;

                for (int m = i + 1; m < j; m++) {
                    int xm = points[m][0];
                    int ym = points[m][1];
                    int xbestI = points[bestI][0];
                    int ybestI = points[bestI][1];
                    if ((ym - xm) >= (ybestI - xbestI)) {
                        bestI = m;
                    }
                }
            }
            int xbestI = points[bestI][0];
            int ybestI = points[bestI][1];
            max = Math.max(max, ybestI - xbestI + xj + yj);

            if ((yj - xj) >= (ybestI - xbestI))
                bestI = j;

        }
        return max;
    }
}