class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, new StringBuilder(), 0, 0, n);
        
        return result;
    }
    
    private void generate(List<String> result, StringBuilder sb, int open, int close, int n) {
        if(open < close) {
            return;
        }
        if(open == n && close == n) {
            result.add(sb.toString());
            
            return;
        }
        if(open < n) {
            sb.append('(');
            generate(result, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < n) {
            sb.append(')');
            generate(result, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}