class Solution {
    public String removeTrailingZeros(String num) {
        int n = 0;
        for(int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if(c == '0')
                n++;
            else {
                break;
            }
        }
        return num.substring(0, num.length() - n);
    }
}