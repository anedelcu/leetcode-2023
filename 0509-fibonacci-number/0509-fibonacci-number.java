class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int fib1 = 0;
        int fib2 = 1;
        int i = 3;
        int fib = fib1 + fib2;
        while(i <= n) {
            fib1 = fib2;
            fib2 = fib;
            fib = fib1 + fib2;
            
            i++;
        }
        return fib;
    }
}