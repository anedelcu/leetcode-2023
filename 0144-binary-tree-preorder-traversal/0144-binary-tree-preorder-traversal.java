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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(res, root);
        return res;
    }
    
    private void preOrder(List<Integer> list, TreeNode root) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        preOrder(list, root.left);
        preOrder(list, root.right);
    }
}