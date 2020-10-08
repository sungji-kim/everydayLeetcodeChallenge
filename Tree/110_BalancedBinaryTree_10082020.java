/**
* 110. Balanced Binary Tree
* Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
*/

/*
* Recursion
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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return balanced;
        height(root);
        return balanced;
    }
    
    public int height(TreeNode root) {
        if(root == null) return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        if(Math.abs(lheight-rheight)>1) balanced = false;
        
        return Math.max(lheight, rheight)+1;
        
    }
}
