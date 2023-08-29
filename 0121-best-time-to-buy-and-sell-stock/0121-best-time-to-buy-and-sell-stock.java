class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int right = 1;
        int maxP = 0;
        while(right < n) {
            if(prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            } 
            else {
                left = right;
            }
            right++;
        }
        
        return maxP;
    }
}