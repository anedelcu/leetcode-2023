class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int n = command.length();
        if(command.charAt(0) == 'G') {
            sb.append("G");
        }
        for(int i = 1; i < n; i++) {
            char c1 = command.charAt(i - 1);
            char c2 = command.charAt(i);
            if(c2 == 'G') {
                sb.append("G");
            }
            else if(c2 == ')' && c1 == '(') {
                sb.append("o");
            }
            else if(c2 == ')' && c1 != '(') {
                sb.append("al");
            }
            else {
                continue;
            }
        }
        return sb.toString();
        
    }
}