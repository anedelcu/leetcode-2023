class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
    private boolean isSelfDividing(int num) {
        int n = num;
        while(n != 0) {
            int digit = n % 10;
            if(digit == 0) {
                return false;
            }
            if(num % digit != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}