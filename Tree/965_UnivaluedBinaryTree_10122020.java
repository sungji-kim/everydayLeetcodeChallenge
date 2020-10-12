/**
* 965. Univalued Binary Tree
* A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.
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
    boolean sol = true;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return sol;
        
        if((root.left != null && root.left.val != root.val) || (root.right != null && root.right.val != root.val)) sol = false;
        isUnivalTree(root.left);
        isUnivalTree(root.right);
        
        return sol;
        
    }
}
