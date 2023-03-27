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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        findLeaves(root1, leaves1);
        findLeaves(root2, leaves2);
        if(leaves1.size() != leaves2.size()) {
            return false;
        }
        for(int  i = 0; i < leaves1.size(); i++) {
            if(leaves1.get(i) != leaves2.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    private void findLeaves(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        if(root.left ==  null && root.right == null) {
            list.add(root.val);
        }
        findLeaves(root.left, list);
        findLeaves(root.right, list);
    }
}