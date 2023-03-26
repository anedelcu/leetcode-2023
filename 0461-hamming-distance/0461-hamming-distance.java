class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        System.out.println("xor = " + xor);
        int distance = 0;
        while(xor != 0) {
            distance++;
            xor &= (xor - 1);
            System.out.println("xor = " + xor);
        }
        return distance;
    }
}