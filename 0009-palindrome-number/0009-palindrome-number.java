class Solution {
    public boolean isPalindrome(int x) {
        if(x <0) {
            return false;
        }
        if( x < 10) {
            return true;
        }
        int n =x;
        int inverse = 0;
        while(x != 0) {
            int d = x % 10;
            inverse = inverse * 10 + d;
            x /= 10;
        }
        System.out.println("Inverse = " + inverse);
        return inverse == n;
    }
}