class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int count = 1;


        while (n >= 0) {

            n = n - i;
            i++;
            count++;
        }
        return count - 2;
    }
}