class Solution {
    public int countAsterisks(String s) {
        int pair = 0;
        int res = 0;
        for(char c : s.toCharArray()) {
            if(c == '|') {
                pair++;
            }
            if(pair % 2 == 0 && c == '*') {
                res++;
            }
        }
        return res;
    }
}