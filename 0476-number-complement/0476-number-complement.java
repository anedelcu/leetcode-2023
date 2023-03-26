class Solution {

    public int findComplement(int num) {
        // calculate the highest set bit in num
        int highestBit = 0;
        int temp = num;
        while (temp != 0) {
            highestBit++;
            temp >>= 1;
        }

        // flip all bits in num up to the highest set bit
        int mask = (1 << highestBit) - 1;
        num ^= mask;

        return num;
    }
}
