class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)) {
            set.add(n);
            long sum = 0;
            while(n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = (int)sum;
            if(n == 1) {
                return true;
            }
            
        }
        return false;
    }
}