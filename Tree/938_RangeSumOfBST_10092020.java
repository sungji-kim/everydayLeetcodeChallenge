/**
* 938. Range Sum of BST
* Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.
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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {        
        if(root == null) return 0;
        
        if(L <= root.val && root.val <= R){
            sum += root.val;
            rangeSumBST(root.left, L, R);
            rangeSumBST(root.right, L, R);
        }
        
        if(root.val < L){
            rangeSumBST(root.right, L, R);
        }
        if(R < root.val){
            rangeSumBST(root.left, L, R);
        }
        
        return sum;
     
    }

}
