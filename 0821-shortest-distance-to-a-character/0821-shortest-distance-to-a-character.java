class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[s.length()];
        Arrays.fill(ans, Integer.MAX_VALUE);
        int pos = -1;
        for(int i = 0; i < n; i++ ) {
            if(s.charAt(i) == c) {
                pos = i;
            }
            if(pos != -1) {
                ans[i] = i - pos;
            }
            
        }
        pos = -1;
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                pos = i;
            }
            if(pos != -1) {
                ans[i] = Math.min(ans[i], pos - i);
            }
        }
        return ans;
    }
}