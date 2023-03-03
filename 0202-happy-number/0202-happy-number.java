class Solution {
    public boolean isHappy(int n) {

        while(true) {
            int sum = 0;
            String numString = String.valueOf(n);
            for(int i= 0; i < numString.length(); i++) {
                int digit = Character.getNumericValue(numString.charAt(i));
                sum += digit * digit;
            }
            n = sum;
            if(n == 1) {
                return true;
            }
            else if(n == 4) {
                return false;
            }
        }
    }
}