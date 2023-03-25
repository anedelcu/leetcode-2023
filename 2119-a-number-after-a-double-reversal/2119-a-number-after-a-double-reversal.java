class Solution {

    public boolean isSameAfterReversals(int num) {
        int rev1 = reversedNumber(num);

        return num == reversedNumber(rev1);
    }

    private int reversedNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = 10 * reversed + num % 10;
            num = num / 10;
        }
        return reversed;
    }
}
