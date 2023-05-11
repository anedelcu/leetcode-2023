class Solution {
    public boolean isThree(int n) {
        int divisors = 2;
        if(n < 3) {
            return false;
        }
        for( int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                divisors++;
            }
        }
        return divisors == 3;
    }
}