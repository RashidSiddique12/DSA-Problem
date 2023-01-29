
//https://leetcode.com/problems/binary-tree-level-order-traversal/description/?envType=study-plan&id=level-1

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

    // public void levelOrderTree(TreeNode root, List<List<Integer>> list){
    //     if(root == null) return;

    //     list.add(root.val);
    //     levelOrderTree(root.left);
    //     levelOrderTree(root.rigth);
    // }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root== null) return list;

        q.add(root);
        while(!q.isEmpty()){
            ArrayList <Integer> ls = new ArrayList<>();
            int size = q.size();

           for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                ls.add(curr.val);

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
           }
           list.add(ls);

        }


        return list;
        
    }
}