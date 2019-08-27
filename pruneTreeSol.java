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
    public TreeNode pruneTree(TreeNode root) {
       TreeNode head = root; 
        prune(head);
        return root;
       
        
    }
    public void prune(TreeNode root) {
         if (root.left != null) {
            if (no1s(root.left)) {
                root.left = null;
            } else {
                 prune(root.left);
            }
        }
        if (root.right != null) {
            if (no1s(root.right)) {
                root.right = null;
            } else {
                 prune(root.right);
            }
        }
        
       
        
    }
    
    
    public boolean no1s(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.val == 1) {
            return false;
        } else {
            if (!no1s(root.left) || !no1s(root.right)) {
                return false;
            }
            
            return true;
        }
        
    }
}