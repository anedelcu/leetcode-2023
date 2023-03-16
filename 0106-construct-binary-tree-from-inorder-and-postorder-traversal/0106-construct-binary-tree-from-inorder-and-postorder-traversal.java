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
    
    Map<Integer, Integer> map = new HashMap<>();
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        index = n - 1;
        
        for(int  i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        
        TreeNode root =  dfs(0, n - 1, inorder, postorder);
        
        return root;
        
    }
    
    private TreeNode dfs(int start, int end, int[] inorder, int[] postorder) {
        // base case
        if(start > end) {
            return null;
        }
        //build the current node
        int currVal = postorder[index--];
        TreeNode curr = new TreeNode(currVal);
        
        // build right subtree
        curr.right = dfs(map.get(currVal) + 1, end, inorder, postorder);
        
        // build left subtree
        curr.left = dfs(start, map.get(currVal) - 1, inorder, postorder);
        
        // return the current node
        return curr;
    }
}