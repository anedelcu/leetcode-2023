class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for(int i = low; i <= high; i++) {
            if(isSymetric(i)) {
                res++;
            }
        }
        return res;
        
    }
    
    private boolean isSymetric(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if(len % 2 != 0) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < len / 2; i++) {
            char c = s.charAt(i);
            sum1 += Character.getNumericValue(c);
        }
        for(int i = len / 2; i < len ; i++) {
            char c = s.charAt(i);
            sum2 += Character.getNumericValue(c);
        }
        return sum1 == sum2;
    }
}