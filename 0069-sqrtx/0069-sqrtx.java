class Solution {
    public int mySqrt(int x) {
         if (x == 0) return 0;
        
        int low = 1, high = x;
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Using division to avoid integer overflow (mid * mid > x)
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}