class Solution {
    public int minIncrementForUnique(int[] nums) {
        
        Arrays.sort(nums); // Sort the array in ascending order
        int moves = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                // Increment the current element to make it unique
                moves += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }

        return moves;
        
    }
}