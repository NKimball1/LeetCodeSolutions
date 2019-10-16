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
    public TreeNode bstToGst(TreeNode root) {
    
        if (root == null) return null;
        traversal(root, 0);
        return root;
        
    }
    
    public int traversal(TreeNode root, int s) {
        
         if (root.right != null) s = traversal(root.right, s); 
         
         root.val += s;
         s += root.val - s;
         
         if (root.left != null) s = traversal(root.left, root.val);
          
         return s;
    }
    
}