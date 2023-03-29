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
        int div = n / 2;
        while(div > 1) {
            if(n % div == 0) {
                res.add(div);
            }
            div--;
        }
        res.add(1);
        return res;
    }
}