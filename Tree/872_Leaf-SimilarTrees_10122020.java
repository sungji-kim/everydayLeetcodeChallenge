/**
* 872. Leaf-Similar Trees
* Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
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
   
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // two leaf-value sequense li1 and li2
        List<Integer> li1 = new LinkedList<>();
        List<Integer> li2 = new LinkedList<>();
        
        // find leaf-value sequence for root1 and root2
        // DFS, recursion
        leafSequence(root1, li1);
        leafSequence(root2, li2);
        
        // check if li1 and li2 are same
        return li1.equals(li2);
    }
    
    public List<Integer> leafSequence(TreeNode root, List<Integer> li){
        if(root.left == null && root.right == null) li.add(root.val);
        
        if(root.left != null) leafSequence(root.left, li);
        if(root.right != null) leafSequence(root.right, li);
        
        return li;
        
    }
}
