class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceSum = 0;
        int bobSum = 0;

        for (int x : aliceSizes) {
            aliceSum += x;
        }

        for (int x : bobSizes) {
            bobSum += x;
        }

        // Alice gives x, Bob gives y
        // aliceSum - x + y = bobSum - y + x
        // x - y = (aliceSum - bobSum) / 2

        int diff = (aliceSum - bobSum) / 2;

        for (int x : aliceSizes) {
            for (int y : bobSizes) {
                if (x - y == diff) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{};
    }
}