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
    public int minDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        
        if (root == null) {
            return 0;
        }
        
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        if (root.left != null) {
            left = 1 + minDepth(root.left);
        }
        
        if (root.right != null) {
            right = 1 + minDepth(root.right);
        }
        
        if (left != 0 && right != 0) {
            return Math.min(left, right);
        } else{
            if (left == 0) {
                return right;
            } else if (right == 0) {
                return left;
            }
        }
        
        return 0;
    }
}