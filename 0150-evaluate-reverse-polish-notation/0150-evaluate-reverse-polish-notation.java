class Solution {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int res = 0;
        for (String s : tokens) {
            if (!isOperator(s)) {
                stack.push(s);
            } else {
                String a = stack.pop();
                String b = stack.pop();
                res = calculate(s, a, b);
                stack.push(String.valueOf(res));
            }
        }
        return Integer.valueOf(stack.peek());
    }

    private boolean isOperator(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }

    private int calculate(String op, String a, String b) {
        if (op.equals("+")) {
            return Integer.valueOf(a) + Integer.valueOf(b);
        } else if (op.equals("-")) {
            return Integer.valueOf(b) - Integer.valueOf(a);
        } else if (op.equals("*")) {
            return Integer.valueOf(a) * Integer.valueOf(b);
        } else {
            return Integer.valueOf(b) / Integer.valueOf(a);
        }
    }
}
