class Solution {
    public boolean isPalindrome(int x) {
        int inverse = 0;
        int num = x;
        if(num < 0) {
            return false;
        }
        while(num > 0) {
            inverse = (inverse * 10) + num % 10;
            num = num / 10;
        }
        return inverse == x;
        
    }
}