class Solution {
    public int maxSum(int[] nums) {
        int maxSum = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(maxDigit(nums[i]) == maxDigit(nums[j]) && maxDigit(nums[i]) != -1 ) {
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        
        
        return maxSum;
        
    }
    
    public int maxDigit(int n) {
        int max = -1;
        while(n > 0) {
            int digit = n % 10;
            max = Math.max(max, digit);
            n /= 10;
        }
        return max;
    }
}