public class CeilingBS {
    static void main(String[] args) {
        int[] arr = {0, 1, 2, 34, 34, 45, 66, 90};
        int target = 92;
        int result = Ceiling(arr, target);
        System.out.println(result);
    }

    static int Ceiling(int[] arr, int target) {
        if (target > arr.length - 1) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
