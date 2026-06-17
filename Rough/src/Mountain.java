public class Mountain {
    static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) { //this means you are in des part of array.
                end = mid;  //we don't know whether mid is answer or not so include it.
            } else {
                start = mid + 1;
            }
        }
        return start; //start and end both are equal cuz both points to most possible answer.
    }
}
