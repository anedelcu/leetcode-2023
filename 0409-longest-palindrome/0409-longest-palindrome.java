class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.equals("")) {
            return 0;
        }
        
        int res = 0;
        int ones = 0;
        int[] freq = new int[128];
        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) {
                freq[c]++;
            }
            else {
                freq[c]++;
            }
        }
        for(int i = 0; i < 128; i++) {
            if(freq[i] > 1 && freq[i] % 2 == 0) {
                res += freq[i];
            }
            else if(freq[i] > 1 && freq[i] % 2 != 0) {
                res += freq[i] - 1;
            }
            
        }
        return res == s.length() ? res : res + 1;
    }
}