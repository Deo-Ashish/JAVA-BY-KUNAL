class Solution {
    public int maxValue(int n, int index, int maxSum) {

        long low = 1;
        long high = maxSum;
        int ans = 1;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            long left = sum(mid - 1, index);
            long right = sum(mid - 1, n - index - 1);

            long total = left + mid + right;

            if (total <= maxSum) {
                ans = (int) mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private long sum(long peak, long count) {

        if (peak >= count) {
            // We can decrease normally:
            // peak, peak-1, peak-2, ...
            return (peak * (peak + 1) 
                    - (peak - count) * (peak - count + 1)) / 2;
        } else {
            // We reach 1 before using all positions
            return peak * (peak + 1) / 2 + (count - peak);
        }
    }
}