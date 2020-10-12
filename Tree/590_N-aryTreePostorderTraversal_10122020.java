/**
* 590. N-ary Tree Postorder Traversal
* Given an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> li = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        // post order - left, right, root
        // dfs - recursion
        
        if(root == null) return li;
        
        for(Node child: root.children){
            postorder(child);
               
        }
        li.add(root.val);
        return li;
    }
}
