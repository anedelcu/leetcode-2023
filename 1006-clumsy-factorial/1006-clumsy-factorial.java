class Solution {
    public int clumsy(int n) {
        Stack<Integer> stack = new Stack();
        stack.push(n);
        for(int  i = n - 1, j = 0; i > 0; i--, j++) {
            if(j % 4 == 0) {
                int res = stack.pop() * i;
                stack.push(res);
            }
            else if(j % 4 == 1) {
                int res = stack.pop() / i;
                stack.push(res);
            }
            else if(j % 4 == 2) {
                stack.push(i);
            }
            else {
                stack.push(-i);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
        
    }
}