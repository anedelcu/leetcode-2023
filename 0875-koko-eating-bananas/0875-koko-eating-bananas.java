class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int maxPile = 1;
        for(int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        int right = maxPile;
        int result = right;
        while(left < right) {
            int k = (left + right) / 2;
            double hours = 0;
            for(int p : piles) {
                hours += Math.ceil((double)p / k);
            }
            if(hours <= h) {
                result = Math.min(result, k);
                right = k;
            }
            else {
                left = k + 1;
            }
        }
        return right;
    }
}