class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;
        int lastPos = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] + i >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}