
/* Pattern 5

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */

public class Patterns {
    static void main(String[] args) {
        pattern5(5);

    }

    static void pattern5(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalCols = row > n ? n * 2 - row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


