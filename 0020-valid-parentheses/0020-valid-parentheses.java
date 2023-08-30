class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (c == ')' || c == ']' || c == '}') {
                    return false;
                } else {
                    stack.push(c);
                }
            } else {
                char lastC = stack.peek();

                if (lastC == '[' || lastC == '(' || lastC == '{') {
                    if (lastC == '(' && c == ')') {
                        stack.pop();
                    } else if (lastC == '[' && c == ']') {
                        stack.pop();
                    } else if (lastC == '{' && c == '}') {
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}
