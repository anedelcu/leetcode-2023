class Solution {
    public boolean checkRecord(String s) {
        int present = 0;
        int absent = 0;
        int late  = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == 'A') {
                absent++;
            }
            else if(i > 1 && s.charAt(i - 2) == 'L' && s.charAt(i - 1) == 'L' && c == 'L') {
                return false;
            }
            if(absent >= 2) {
                return false;
            }
        }
        return true;
    }
}