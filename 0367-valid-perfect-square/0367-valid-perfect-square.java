class Solution {
    public boolean isPerfectSquare(int num) {

        long low = 0;
        long high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // for (long i = 1; i * i <= num; i++) {
        //     if (i * i == num) {
        //         return true;
        //     }
        // }
        return false;
    }
}