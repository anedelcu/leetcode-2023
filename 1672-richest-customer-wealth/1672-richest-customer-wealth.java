class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int res = 0;
        for(int i = 0; i < n; i++) {
            int wealth = 0;
            for(int j = 0; j < m; j++) {
                wealth += accounts[i][j];
            }
            res = Math.max(res, wealth);
        }
        return res;
    }
}