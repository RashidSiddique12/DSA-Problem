//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/


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
    public int maxDepth(TreeNode root) {

        //Recurrsion
        if(root == null) return 0;
        int lh = maxDepth(root.left);
        int hh = maxDepth(root.right);

        return 1+ Math.max(lh, hh);
        
    }
}