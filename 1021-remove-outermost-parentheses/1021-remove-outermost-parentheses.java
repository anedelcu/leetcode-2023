class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res  = new StringBuilder(s);
        int open = 0;
        int close = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            if(c == '(') {
                open++;
            }
            else {
                close++;
            }
            if(open == close) {
                res.deleteCharAt(start);
                i--;
                res.deleteCharAt(i);
                start = i;
                i--;
            }
        }
        return res.toString();
        
    }
}