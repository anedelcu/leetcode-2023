class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        String w = s.trim();
        for(int i = w.length() - 1; i >= 0; i--) {
            if(w.charAt(i) != ' ') {
                len++;
            }
            else {
                break;
            }
        }
        
        return len;
    }
}