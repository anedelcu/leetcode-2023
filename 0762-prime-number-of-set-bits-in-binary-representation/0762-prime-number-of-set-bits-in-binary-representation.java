class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            int countBits = Integer.bitCount(i);
            if(isPrime(countBits)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= (n / 2); i++) {
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }
}