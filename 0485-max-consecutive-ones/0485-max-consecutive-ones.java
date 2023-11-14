class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxW = 0;
        int w = 0;
        int start = 0;
        while(start < nums.length && nums[start]  != 1) {
            start++;
        }
        int end = start;
        while(end < nums.length) {
            w = 0;
            while(end < nums.length && nums[end] != 0) {
                end++;
                w++;
            }
            maxW = Math.max(maxW, w);
            end++;
        }
        return maxW;
    }
}