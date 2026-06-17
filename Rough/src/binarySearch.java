public class binarySearch {
    static void main(String[] args) {

        int[] arr = {0, 1, 2, 34, 34, 45, 66, 90};
        int target = 66;
        int result = BinarySearch(arr, target);
        System.out.println(result);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
