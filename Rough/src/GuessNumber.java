public class GuessNumber {
    static void main(String[] args) {
        int n = 100;
        int pick = (int) (Math.random() * n) + 1;
        System.out.print(pick);
    }
}
