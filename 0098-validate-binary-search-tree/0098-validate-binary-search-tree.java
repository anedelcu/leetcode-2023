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
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        long left = Long.MIN_VALUE;
        long  right = Long.MAX_VALUE;
        return isValid(root, left, right);
        
    }
    
    private boolean isValid(TreeNode curr, long left, long right) {
        if(curr == null) {
            return true;
        }
        if(curr.val <= left || curr.val >= right) {
            return false;
        }
        return isValid(curr.left, left, curr.val) && isValid(curr.right, curr.val, right);
    }
}