class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count; 
    }

    public int countDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int digit = 0;
        while (num != 0) {
            num = num / 10;
            digit++;
        }
        return digit;
    }

    public boolean hasEvenDigits(int element) {
        int digitCount = countDigits(element);
        return digitCount % 2 == 0;
    }
}