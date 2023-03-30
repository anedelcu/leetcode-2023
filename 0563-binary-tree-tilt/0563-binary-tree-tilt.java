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
    int sum = 0;
    public int findTilt(TreeNode root) {
        tilt(root);
        return sum;
    }
    
    private int tilt(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSum = tilt(root.left);
        int rightSum = tilt(root.right);
        int t = Math.abs(leftSum - rightSum);
        sum += t;
        return root.val + rightSum + leftSum;
    }
}