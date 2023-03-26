//https://leetcode.com/problems/balanced-binary-tree/

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
    // public boolean calculate(Tree)
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return height(root) != -1;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int df = Math.abs(left - right);

        if(df > 1 || left == -1 || right == -1) return -1;

        return 1 + Math.max(left, right);
    }
}