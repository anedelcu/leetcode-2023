class Solution {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquareDigits(n);
        while (fast != 1 && fast != slow) {
            slow = sumOfSquareDigits(slow);
            fast = sumOfSquareDigits(sumOfSquareDigits(fast));
        }
        return fast == 1;
    }

    private int sumOfSquareDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, 2);
            n = n / 10;
        }
        return sum;
    }
}
