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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root, new StringBuilder(), result);
        return result;
    }

    private void dfs(TreeNode node, StringBuilder path, List<String> result) {
        int len = path.length();
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            path.append(node.val);
            result.add(path.toString());
            path.setLength(len); // backtrack to previous state
            return;
        }
        path.append(node.val).append("->");
        dfs(node.left, path, result);
        dfs(node.right, path, result);
        path.setLength(len); // backtrack to previous state
    }
}
