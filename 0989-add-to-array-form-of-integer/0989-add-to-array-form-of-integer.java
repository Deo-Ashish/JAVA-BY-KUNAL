class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int e = num.length - 1;
        int carry = 0;

        while (k > 0 || carry > 0) {

            int l = k % 10;
            k = k / 10;

            if (e >= 0) {
                num[e] += l + carry;
            } else {
                // k has more digits than num
                ArrayList<Integer> res = new ArrayList<>();

                int sum = l + carry;
                res.add(0, sum % 10);
                carry = sum / 10;

                while (k > 0) {
                    sum = k % 10 + carry;
                    res.add(0, sum % 10);
                    carry = sum / 10;
                    k = k / 10;
                }

                for (int i = 0; i < num.length; i++) {
                    res.add(num[i]);
                }

                if (carry > 0) {
                    res.add(0, carry);
                }

                return res;
            }

            carry = num[e] / 10;
            num[e] = num[e] % 10;

            e--;
        }

        ArrayList<Integer> res = new ArrayList<>();

        if (carry > 0) {
            res.add(carry);
        }

        for (int i = 0; i < num.length; i++) {
            res.add(num[i]);
        }

        return res;
    }
}