/**
* 687. Longest Univalue Path
* Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

The length of path between two nodes is represented by the number of edges between them.
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
    int longest = 0;
    
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return longest;
        
        helper(root);
        return longest;
    }
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int leftPath = 0;
        int rightPath = 0;
        if(root.left != null && root.left.val == root.val)
            leftPath += left+1;
        if(root.right != null && root.right.val == root.val)
            rightPath += right;
        
        longest = Math.max(longest, leftPath+rightPath);
        
        return Math.max(leftPath, rightPath);
    }
    
    
}
