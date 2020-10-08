/**
* 563. Binary Tree Tilt
* Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.
*/

/**
* With this problem, we can learn recursion algorithm. 
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
    int tilt = 0;
    
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        findSum(root, 0);
        return tilt;
    }
    
    public int findSum(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        
        int lSum = findSum(root.left, sum);
        int rSum = findSum(root.right, sum);
        
        tilt += Math.abs(lSum-rSum);
        
        return sum + lSum + rSum + root.val;
    }
}
