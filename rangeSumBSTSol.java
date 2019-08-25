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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        
        //Base Case
        if (root.left == null && root.right == null) {
            return sum;
        //Resursion otherwise
        } else if (root.right != null && root.left != null) {
            return sum + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        } else if (root.left != null && root.right == null) {
            return sum + rangeSumBST(root.left, L, R);
        } else if (root.left == null && root.right != null) {
            return sum + rangeSumBST(root.right, L, R);
        }
        
        return sum;
    }

}