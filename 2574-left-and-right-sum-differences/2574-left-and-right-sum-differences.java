class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int leftSum = 0;
        int rightSum = 0;
        for(int num : nums) {
            rightSum += num;
        }
        for(int i = 0; i < n; i++) {
            
            rightSum -= nums[i];
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}