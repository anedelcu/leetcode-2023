class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1) {
            return false;
        }
        List<Integer> divisors = divisors(num);
        int sum = 0;
        for(int div : divisors) {
            sum += div;
        }
        return sum == num;
    }
    
    private List<Integer> divisors(int n) {
        List<Integer> res = new ArrayList<>();
        //int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                res.add(i);
                if(i * i != n) {
                    res.add(n / i);
                }
            }
        }
        res.add(1);
        return res;
    }
}