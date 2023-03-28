class Solution {
    public int[] constructRectangle(int area) {
        int L = 1;
        int W = (int)Math.sqrt(area);
        while(W > 0) {
            if(area % W == 0) {
                return new int[]{area / W, W};
            }
            W--;
        }
        return new int[]{};
    }
}