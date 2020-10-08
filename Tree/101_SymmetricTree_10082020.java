/**
* 101. Symmetric Tree
* Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
*/

/**
* With this problem, we can practice recursion. 
*/

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if((left != null && right == null) || (left == null & right != null)) return false;
        
        if(left.val != right.val) return false;
        
        return helper(left.left, right.right) && helper(right.left, left.right);
    }
}
