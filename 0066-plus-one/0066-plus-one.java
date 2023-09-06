class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n - 1;
        if (digits[i] != 9) {
            digits[i]++;
            return digits;
        } else {
            while (i >= 0 && digits[i] == 9) {
                digits[i] = 0;
                i--;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        } else {
            digits[i]++;
        }

        return digits;
    }
}
