class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> res = new ArrayList<>();

        int e = num.length - 1;
        int carry = 0;

        while (e >= 0 || k > 0 || carry > 0) {

            int sum = carry;

            if (e >= 0) {
                sum += num[e];
                e--;
            }

            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }

            res.add(0, sum % 10);
            carry = sum / 10;
        }

        // If there are remaining digits in num
        while (e >= 0) {
            res.add(0, num[e]);
            e--;
        }

        return res;
    }
}