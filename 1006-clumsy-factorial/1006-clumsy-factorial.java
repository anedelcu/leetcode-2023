class Solution {
    public int clumsy(int n) {
        double res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(n--);
        int op = 0;
        while(n > 0) {
            
            if(op == 0) {
                res = stack.pop() * n;
                stack.push((int)res);
            }
            else if(op == 1) {
                System.out.println(Math.floor(stack.peek()));
                res = Math.floor(stack.pop() / n);
                stack.push((int)res);
            }
            else if(op == 2) {
                stack.push(n);
            }
            else {
                stack.push(-1*n);
            }
            op++;
            op = op % 4;
            n--;
           
        }
        res = 0;
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            res += stack.pop();
        }
        return (int)res;
    }
}