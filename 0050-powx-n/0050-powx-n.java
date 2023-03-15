class Solution {

    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n >= 0) {
            return recFunc(x, n);
        } else {
            return 1 / recFunc(x, n);
        }
    }

    private double recFunc(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double result = recFunc(x, n / 2);
        result *= result;
        if (n % 2 == 0) {
            return result;
        } else {
            return result * x;
        }
    }
}
