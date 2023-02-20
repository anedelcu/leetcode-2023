class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // Add 1 to the least significant digit
        digits[n - 1]++;
        // Propagate the carry from the least significant digit
        for (int i = n - 1; i > 0 && digits[i] == 10; i--) {
            digits[i] = 0;
            digits[i - 1]++;
        }
        // If there is a carry from the most significant digit, add an extra digit
        if (digits[0] == 10) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
