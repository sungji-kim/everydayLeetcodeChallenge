/**
* 897. Increasing Order Search Tree
* Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.
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
    List<Integer> li =  new LinkedList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        
        TreeNode ans = new TreeNode();
        TreeNode cur = ans;
        
        for(int n: li){
            cur.right = new TreeNode(n);
            cur = cur.right;
        }
        
        return ans.right;
    }
    
    public List<Integer> inorder(TreeNode root){
        if(root == null) return li;
        
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
        return li;
    }
}
