class Solution {
    public String addStrings(String num1, String num2) {
        int[] result = new int[Math.max(num1.length(), num2.length()) + 1];
        int index = 0;
        for(int i = num1.length() - 1; i >= 0; i--) {
            char c = num1.charAt(i);
            result[index] += Character.getNumericValue(c);
            index++;
        }
        index = 0;
        for(int i = num2.length() - 1; i >= 0; i--) {
            char c = num2.charAt(i);
            result[index] += Character.getNumericValue(c);
            index++;
        }
        int carry =0;
        for(int i = 0; i < result.length; i++) {
            if(carry + result[i] > 9) {
                result[i] = carry + result[i] - 10;
                carry = 1;
            }
            else {
                result[i] = carry + result[i];
                carry = 0;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = result.length - 1; i >= 0; i--) {
            if(i == result.length - 1 && result[i] == 0) {
                continue;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }
}