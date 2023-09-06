class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            // check palindromic substrings of odd length
            int left = i;
            int right = i;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                res++;
                left--;
                right++;
            }
            // check palindromic substrings of even length
            left = i;
            right = i + 1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                res++;
                left--;
                right++;
            }
        }
        return res;
    }
}