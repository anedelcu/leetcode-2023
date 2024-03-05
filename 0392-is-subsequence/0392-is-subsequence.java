class Solution {
    public boolean isSubsequence(String s, String t) {
       
        if(t.length() < s.length()) {
            return false;
        }
        if(s.length() ==0) {
            return true;
        }
        int count = 0;
        int j = 0;
        for(int i = 0; i < t.length(); i++) {
            if(j == s.length()) {
                return true;
            }
            if(t.charAt(i) == s.charAt(j)) {
                j++;
            }
            else {
                continue;
            }
        }
        return j == s.length();
    }
}