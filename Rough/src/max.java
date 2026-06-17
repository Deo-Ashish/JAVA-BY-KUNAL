public class max {
    void main(String[] args) {

        int[] arr = {1, 233, 43, 4, 5};
        System.out.println(Max(arr, 0, 1));;

    }

    static int Max(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
