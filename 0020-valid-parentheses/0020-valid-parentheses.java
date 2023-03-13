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
                char last = stack.peek();
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (last == '(' && c == ')') {
                    stack.pop();
                } else if (last == '[' && c == ']') {
                    stack.pop();
                } else if (last == '{' && c == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
