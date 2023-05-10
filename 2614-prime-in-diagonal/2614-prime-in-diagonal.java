class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime(nums[i][i]) && nums[i][i] >= res ) {
                res = nums[i][i];
            }
            if(isPrime(nums[i][n - i - 1]) && nums[i][n - i - 1] >= res ) {
                res = nums[i][n - i - 1];
            }
        }
        return res;
    }
    
    private boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        } 
        return true;
    }
}