class Solution {
    public List<Integer> countSmaller(int[] nums) {

        List<Integer> result = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();

        // Initialize result with 0
        for (int i = 0; i < nums.length; i++) {
            result.add(0);
        }

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {

            int low = 0;
            int high = sorted.size();

            // Binary Search
            while (low < high) {
                int mid = low + (high - low) / 2;

                if (sorted.get(mid) < nums[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            // low = number of elements smaller than nums[i]
            result.set(i, low);

            // Insert in sorted position
            sorted.add(low, nums[i]);
        }

        return result;
    }
}