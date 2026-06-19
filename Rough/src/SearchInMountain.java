public class SearchInMountain {
    static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 1};
        int target = 3;
        System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
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

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
