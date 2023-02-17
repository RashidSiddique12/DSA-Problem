//https://leetcode.com/problems/minimum-distance-between-bst-nodes/



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
    public void inorder(TreeNode root, List list){
        if(root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size()-1; i++){
            min = Math.min(min, list.get(i+1)-list.get(i));
        }
        
       return min;
        
    }
}