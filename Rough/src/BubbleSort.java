import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        sort(arr);
        System.out.println(Arrays.toString(arr));
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
