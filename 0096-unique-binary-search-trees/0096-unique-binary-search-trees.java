class Solution {

    public int numTrees(int n) {
        // Initialize an array to store the number of unique BSTs for different numbers of nodes
        int[] dp = new int[n + 1];
        
        // There is only one unique BST for 0 and 1 nodes
        dp[0] = 1;
        dp[1] = 1;
        
        // For i nodes, consider all possible root nodes from 1 to i 
        // and compute the number of unique BSTs
        for(int  i = 2; i <= n; i++) {
            // For each root node, the number of unique BSTs is the product
            // of unique BSTs of its lest and right subtrees
            for(int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        // The final Value in the dp array gives the number of unique BSTs 
        // that can be formed with n nodes
        return dp[n];
        
    }
}
