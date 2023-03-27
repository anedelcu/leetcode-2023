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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    private int height(TreeNode root) {
        int h = 0;
        if(root  == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            h++;
        }
        return h;
    }
}