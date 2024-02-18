/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }
    
    private boolean helper(TreeNode node, int currSum, int targetSum) {
        if(node == null) {
            return false;
        }
        currSum += node.val;
        if(node.left == null && node.right == null) {
            return currSum == targetSum;
        }
        return helper(node.left, currSum, targetSum) || helper(node.right, currSum, targetSum);
    }
}