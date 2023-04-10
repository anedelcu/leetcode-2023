class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
            System.out.println("sign: " + sign);
        }
        
        if ((dividend < 0 && divisor < 0)) {
            sign = 1;
        }
        System.out.println("sign: " + sign);
        long absDividend = Math.abs((long)dividend);
        System.out.println("dividend: " + absDividend);
        long absDivisor = Math.abs((long)divisor);
        System.out.println("divisor: " + absDivisor);
        int count = 0;
        long result = 0;
        if(absDivisor == 1) {
            result = absDividend * sign;
            System.out.println("result: " + result);
            result = (result > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (result < Integer.MIN_VALUE) ? Integer.MIN_VALUE : result;
            return (int)result;
        }
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            count++;
        }
        result = sign * count;
        result = (result > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (result < Integer.MIN_VALUE) ? Integer.MIN_VALUE : result;
        return (int)result;
    }
}
