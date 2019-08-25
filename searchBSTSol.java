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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) {
            return root;
        } else {
            //Traverse left
           if (root.val > val) {
               if (root.left == null) {
                   return null;
               }
               return searchBST(root.left, val);
               
        }
            //Traverse right
            if (root.val < val) {
                if (root.right == null) {
                   return null;
                }
                return searchBST(root.right, val);
            }
            
        }
        
        return null;
        
    }
}