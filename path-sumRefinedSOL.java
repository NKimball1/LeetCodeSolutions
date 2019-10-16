/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null) return false; 
        
        return traversal(root, sum, 0);
        
    }
    
    private boolean traversal(TreeNode root, int sum, int count) {
       
        if (root.left == null && root.right == null) {
            if (sum == root.val + count) return true;
        }
        
        if (root.left != null) {
            if (traversal(root.left, sum, count + root.val)) return true;
        }
        
        if (root.right != null){
            if (traversal(root.right, sum, count + root.val)) return true;
        }
        
        return false;
        
    }
}