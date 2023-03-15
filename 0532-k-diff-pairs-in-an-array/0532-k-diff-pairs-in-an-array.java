import java.util.HashMap;

public class Solution {

    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 1, count = 0;

        while (left < nums.length && right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                // Move right pointer to the next distinct element that is at least k away from nums[left]
                right++;
            } else if (nums[right] - nums[left] > k) {
                // Move left pointer to the next distinct element
                left++;
            } else {
                // We found a k-diff pair
                count++;
                left++;
                right++;
                // Skip duplicates for both pointers
                while (left < nums.length && nums[left] == nums[left - 1]) left++;
                while (right < nums.length && nums[right] == nums[right - 1]) right++;
            }
        }

        return count;
    }
}
