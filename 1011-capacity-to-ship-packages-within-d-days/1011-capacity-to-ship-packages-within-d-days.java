class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Find minimum and maximum possible capacity
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        // Binary Search
        while (low < high) {

            int mid = low + (high - low) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            // Check how many days are needed
            for (int weight : weights) {

                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            // Capacity is too small
            if (requiredDays > days) {
                low = mid + 1;
            }
            // Capacity works, try smaller
            else {
                high = mid;
            }
        }

        return low;
    }
}