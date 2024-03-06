class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        s = s.trim();
        int i = s.length() -1;
        while(i >=0 && s.charAt(i) != ' ') {
            res++;
            i--;
        }
        return res;
    }
}