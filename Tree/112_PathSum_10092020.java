/**
* 112. Path Sum
* Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
    
        if(root.left == null && root.right == null) return sum == root.val;
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum- root.val);
    }
    
}

class Solution {
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return res;
        pathSum(root, 0, sum);
        return res;
    }
    
    public int pathSum(TreeNode root, int sumSoFar, int sum){
        sumSoFar += root.val;
        if (root.left == null && root.right == null){
            if (sum == sumSoFar) res = true;
        }
        
        if(root.left != null)
            pathSum(root.left, sumSoFar, sum);
        if(root.right != null)
            pathSum(root.right, sumSoFar, sum);
        
        return sumSoFar;
        
    }
}
