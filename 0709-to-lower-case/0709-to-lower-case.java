class Solution {
    public String toLowerCase(String s) {
        char[] chArray = s.toCharArray();
        for(int i = 0; i < chArray.length; i++) {
            if(chArray[i] >= 65 && chArray[i] <= 90) {
                chArray[i] = (char)(chArray[i] + 32);
            }
        }
        return new String(chArray);
    }
}