
//https://leetcode.com/problems/validate-binary-search-tree/?envType=study-plan&id=level-1

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
    public TreeNode pre=null;
    public boolean isValidBST(TreeNode root) {
    
     if(root!=null){
         if(!isValidBST(root.left)) return false;
         if(pre!=null && root.val<=pre.val) return false;
         pre=root;
         return isValidBST(root.right);
     }   
     return true;
    }
}