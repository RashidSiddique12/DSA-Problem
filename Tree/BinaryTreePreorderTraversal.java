//https://leetcode.com/problems/binary-tree-preorder-traversal/


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
    public void preorderNode(TreeNode root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            preorderNode(root.left, list);
            preorderNode(root.right, list);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer> ();
        preorderNode(root, list);
        return list;
    }
}