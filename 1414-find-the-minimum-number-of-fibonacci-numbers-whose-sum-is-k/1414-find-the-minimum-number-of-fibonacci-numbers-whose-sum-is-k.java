class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        int fib0 = 0;
        int fib1 = 1;
        list.add(fib1);
        int fib = fib0 + fib1;
        list.add(fib);
        int  i = 2;
        while(fib <= k) {
            fib0 = fib1;
            fib1 = fib;
            fib = fib0 + fib1;
            list.add(fib);
        }
        int j = list.size() - 1;
        int count = 0;
        int sum = 0;
        while(sum != k) {
            while(list.get(j) + sum <= k) {
                sum += list.get(j); 
                count++;
            }
            j--;
        }
        return count;
    }
}