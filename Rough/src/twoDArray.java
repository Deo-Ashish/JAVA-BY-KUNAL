import java.util.Arrays;

public class twoDArray {
    static void main(String[] args) {
        int[][] num = {
                {10, 2, 3, 70},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int target = 8;
//        int[] ans = search(num, target);
        int ans = search(num);
//        System.out.println(Arrays.toString(ans));
        System.out.println(ans);
        System.out.println(num.length);
    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ar : arr) {
            for (int ele : ar) {
                if (ele > max) {
                    max = ele;
                }
            }
        }
        return max;
    }
}
