// https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/
class Solution {
    public void helper(Node root, List<Integer> list) {
        if (root == null)
            return;
        for (Node e : root.children) {
            helper(e, list);
        }
        list.add(root.val);
        return;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;

    }
}