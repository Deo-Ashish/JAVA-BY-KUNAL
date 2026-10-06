import java.util.Arrays;

public class Sorting {
    static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapMaxElement(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapMaxElement(arr, maxIndex, last);
        }
    }

    private static void swapMaxElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void sort(int[] arr) {
        boolean isSwapped = false;

        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }
}
