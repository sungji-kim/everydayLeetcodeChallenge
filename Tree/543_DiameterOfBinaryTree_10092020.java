/**
* 543. Diameter of Binary Tree
* Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
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

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterHelper(root);
        return diameter;
    }   
    public int diameterHelper(TreeNode root){
        if(root == null) return 0;
        
        int left = diameterHelper(root.left);
        int right = diameterHelper(root.right);
        
        diameter = Math.max(diameter, left+right);
        return Math.max(left, right)+1;
    }
}
