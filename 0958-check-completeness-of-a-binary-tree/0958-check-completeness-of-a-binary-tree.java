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

    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean nodeNull = false;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp == null) {
                nodeNull = true;
            } else {
                if(nodeNull) {
                    return false;
                }
                queue.add(temp.left);
                queue.add(temp.right);
                
            }
        }
        return true;
    }
}
