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

    public void recoverTree(TreeNode root) {
        TreeNode cur = root, prev = null, first = null, second = null;

        while (cur != null) {
            TreeNode pre = cur.left;

            if (pre != null) {
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    pre.right = null;
                }
            }

            if (prev != null && prev.val > cur.val) {
                if (first == null) {
                    first = prev;
                }
                second = cur;
            }

            prev = cur;
            cur = cur.right;
        }

        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }
}
