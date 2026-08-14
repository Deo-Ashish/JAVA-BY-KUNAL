class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ans = new int[n + 1];

        int maxValue = 0;
        int startingPoint = 0;

        for (int i = 0; i < n; i++) {
            ans[i] = startingPoint;
            startingPoint += gain[i];
            if (maxValue < startingPoint) {
                maxValue = startingPoint;
            }
        }
        return maxValue;
    }
}