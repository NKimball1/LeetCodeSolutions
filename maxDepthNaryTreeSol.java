/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        int depth = 0;
        if(root == null) return 0;
        Node curr = null;
    
        Queue<Node> queue = new LinkedList<>();
         queue.offer(root);
    
        while (!queue.isEmpty()) {
            
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr = queue.poll();
                for (int j = 0; j < curr.children.size(); j++) {
                    queue.offer(curr.children.get(j));
                }
            
                    
            }
            depth++;
         }
        
        return depth; 
    }
}