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
    public int maxDepth(TreeNode root) {
        int left = 1;
        int right = 1;
        
        if (root == null) {
            return 0;
        }
        
        if (root.left != null) {
            left = 1 + maxDepth(root.left);
        }
        
        if (root.right != null) {
            right = 1 + maxDepth(root.right);
        }
        
        return Math.max(left, right);
        
    }
}