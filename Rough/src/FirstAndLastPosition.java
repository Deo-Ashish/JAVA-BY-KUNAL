import java.util.Arrays;

//Find the first and last index of target element
public class FirstAndLastPosition {
    static void main(String[] args) {
        int[] arr = {12, 23, 33, 33, 33, 88};
        int target = 33;
        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        //check for first occurrence if target
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //this function just returns the index value of the target
    static int search(int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                //potential ans
                ans = mid;
                if (firstStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

