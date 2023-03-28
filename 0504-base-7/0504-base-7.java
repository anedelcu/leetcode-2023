class Solution {
    public String convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean sign = false;
        if(num < 0) {
            sign = true;
        }
        while(num != 0) {
            sb.append(Math.abs(num % 7));
            num = num / 7;
        }
        if(sign) {
            sb.append("-");
        }
        return sb.reverse().toString();
        
    }
}