/**
* 617. Merge Two Binary Trees
* Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
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
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode res = new TreeNode();
        if(t1 == null && t2 == null) res = null;
        else{
            if(t1 == null) {
                res.val = t2.val;
                res.left = mergeTrees(null, t2.left);
                res.right = mergeTrees(null, t2.right);
            }else if(t2 == null) {
                res.val = t1.val;
                res.left = mergeTrees(t1.left, null);
                res.right = mergeTrees(t1.right, null);
            }else{
                res.val = t1.val + t2.val;
                res.left = mergeTrees(t1.left, t2.left);
                res.right = mergeTrees(t1.right, t2.right);
            
            }
            
            
        }
        
        return res;
        
    }
}
