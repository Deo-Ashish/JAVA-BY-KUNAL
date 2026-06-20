public class SmallestLetter {
    //Find smallest letter after the target element.

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'f';
        char result = nextGreatestLetter(arr, target);
        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}

