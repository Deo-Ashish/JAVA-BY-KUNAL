void main() {
    int[] nums = {7, 2, 5, 10, 8};
    int k = 2;
    System.out.println(splitArray(nums, k));
}

public int splitArray(int[] nums, int k) {
    int start = 0;
    int end = 0;

    for (int num : nums) {
        start = Math.max(start, num);
        end += num;
    }

    //apply binary search
    while (start < end) {
        int mid = start + (end - start) / 2;

        int sum = 0;
        int pieces = 1;

        for (int num : nums) {
            if (num + sum > mid) {
                sum = num;
                pieces++;
            } else {
                sum += num;
            }
        }

        if (pieces > k) {
            start = mid + 1;
        } else {
            end = mid;
        }
    }
    return start;
}
