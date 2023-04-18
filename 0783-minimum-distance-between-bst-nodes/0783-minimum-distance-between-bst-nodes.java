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
    
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;
        inOrder(root, list);
        for(int i = 1; i < list.size(); i++) {
            minDif = Math.min(minDif, list.get(i) - list.get(i - 1));
        }
        return minDif;
    }
    private void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}