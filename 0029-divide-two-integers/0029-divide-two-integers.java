class Solution {

    public int divide(int dividend, int divisor) {
        // Handle the special case of dividing by zero
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        // Handle the special case of dividing the smallest possible integer by -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Compute the sign of the quotient
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Convert dividend and divisor to positive long integers to handle overflow
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize the quotient to zero
        int quotient = 0;

        // Perform long division
        for (int i = 31; i >= 0; i--) {
            if ((absDividend >> i) >= absDivisor) {
                // If the dividend is greater than or equal to the divisor multiplied by 2^i, subtract that product from the dividend and add 2^i to the quotient
                absDividend -= absDivisor << i;
                quotient += 1 << i;
            }
        }

        // Apply the sign to the quotient
        quotient *= sign;

        // Handle the case where the quotient overflows
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return quotient;
        }
    }
}
