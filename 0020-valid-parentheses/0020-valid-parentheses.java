class Solution {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (c == ')' || c == ']' || c == '}') {
                    return false;
                } else {
                    stack.push(c);
                }
            } else {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    char ch = stack.pop();
                    if (ch == '(' && c != ')') {
                        return false;
                    } else if (ch == '[' && c != ']') {
                        return false;
                    } else if (ch == '{' && c != '}') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
