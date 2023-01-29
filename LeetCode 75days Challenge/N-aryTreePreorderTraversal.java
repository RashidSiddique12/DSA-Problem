//https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/?envType=study-plan&id=level-1

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
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        naryPreorder(root, list);

        return list;
    }

    public void naryPreorder(Node root, ArrayList<Integer> list){
        if(root == null) return;

        list.add(root.val);
        for(Node e : root.children){
            naryPreorder(e, list);
        }
    }
}