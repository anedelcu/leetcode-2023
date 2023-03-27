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
    Map<Integer, List<TreeNode>> map = new HashMap<>();
    
    public List<TreeNode> allPossibleFBT(int n) {
        if(!map.containsKey(n)) {
            List<TreeNode> result = new ArrayList<>();
            if(n == 1) {
                result.add(new TreeNode(0));
            }
            else if( n % 2 == 1) {
                for(int i = 0; i < n; i++) {
                    int j = n - 1 - i;
                    for(TreeNode left : allPossibleFBT(i)) {
                        for(TreeNode right : allPossibleFBT(j)) {
                            TreeNode tree = new TreeNode(0);
                            tree.left = left;
                            tree.right = right;
                            result.add(tree);
                        }
                    }
                }
            }
            map.put(n, result);
        }
        
        return map.get(n);
        
    }
}