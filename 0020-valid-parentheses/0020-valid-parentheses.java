class Solution {

    public static boolean isValid(String s) {
        if(s == null || s.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(stack.isEmpty()) {
                if(c == ']' || c == ')' || c == '}') {
                    return false;
                }
                else {
                    stack.push(c);
                }
            }
            else {
                if(c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }
                else if(c == ')' ) {
                    char lastChar = stack.pop();
                    if(lastChar != '(') {
                        return false;
                    }
                }
                else if(c == ']' ) {
                    char lastChar = stack.pop();
                    if(lastChar != '[') {
                        return false;
                    }
                }else if(c == '}' ) {
                    char lastChar = stack.pop();
                    if(lastChar != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
        
    }
}
