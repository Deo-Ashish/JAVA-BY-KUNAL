class Solution {
    int[] count;
    int[] index;
    int[] temp;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        count = new int[n];
        index = new int[n];
        temp = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(nums, 0, n - 1);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(count[i]);
        }

        return result;
    }

    void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;
        int smaller = 0;

        while (i <= mid && j <= right) {

            if (nums[index[j]] < nums[index[i]]) {
                smaller++;
                temp[k++] = index[j++];
            } else {
                count[index[i]] += smaller;
                temp[k++] = index[i++];
            }
        }

        while (i <= mid) {
            count[index[i]] += smaller;
            temp[k++] = index[i++];
        }

        while (j <= right) {
            temp[k++] = index[j++];
        }

        for (int x = left; x <= right; x++) {
            index[x] = temp[x];
        }
    }
}