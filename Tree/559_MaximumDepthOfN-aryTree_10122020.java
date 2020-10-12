/**
* 559. Maximum Depth of N-ary Tree
* Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

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
/**
* DFS Algorithm - faster
*/
class Solution {
    int depth = 0;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int depth = 0;
        for (Node child: root.children) {
            depth = Math.max(depth, maxDepth(child));
        }
        return depth + 1;
    }
}
/**
* BSF Algorithm 
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        
        int height = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                Node n = q.poll();
                for(Node child : n.children){
                    q.offer(child);
                }
            }
            height++;
        }
        
        return height;
    }
}
