class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int maxOnes = 0;
        int start = 0;
        while (start < nums.length) {
            while (start < nums.length && nums[start] == 0) {
                start++;
            }
            while (start < nums.length && nums[start] == 1) {
                ones++;
                start++;
            }
            maxOnes = Math.max(maxOnes, ones);
            ones = 0;
        }
        return maxOnes;
    }
}
