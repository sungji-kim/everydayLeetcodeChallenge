/*
700. Search in a Binary Search Tree

Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. 
Return the subtree rooted with that node. 
If such node doesn't exist, you should return NULL.
*/

/*
<My WRONG Solution - DOES NOT COMPILE>
*/
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // leaf
        if (root.left == null && root.right == null){
            if(root.val == val){
                return root;
            } else{
                return null;
            }
            
            
        } else{ // non-leaf
            if(root.left !=null){
                searchBST(root.left, val);
            }
            if(root.right !=null){
                searchBST(root.right, val);
                
            }
        }
    }
}





/*
<Optimized Solution>

Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
Memory Usage: 40 MB, less than 47.33% of Java online submissions for Search in a Binary Search Tree.

https://jeffchern.gitbook.io/java-notes/tree/700.-search-in-a-binary-search-tree
*/
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
         if (root == null) {return null;}
         if (root.val == val) {return root;}
         TreeNode left = searchBST(root.left, val);
         TreeNode right = searchBST(root.right, val);
         
         if (left != null) {
             return left;
         } else if (right != null) {
             return right;
         } else {
             return null;
         }    
    
       
    }
}

/*
Comment: I did not have a strong concept of recursion, so I couldn't come up with an answer within 30 minutes. The solution was actually really simple.
First, check if the node is null. If not, check if its value is equal to "val" or not.
Then, use recursion to get searchBST() for node.left and node.right.
If, either one is not null, return that value. If both are null, return null.
With this example, I could practice recursion. 
