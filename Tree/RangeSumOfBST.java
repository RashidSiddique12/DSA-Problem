
//https://leetcode.com/problems/range-sum-of-bst/description/

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
import java.util.*;
class Solution {


    int result =0;
    public int rangeSumBST(TreeNode root, int low, int high) {
   //Using Recursion and Utilize the BST to reduce time complexity
   if(root == null) return 0;

   if(root.val > high){
      return rangeSumBST(root.left, low, high);
   }
   else if(root.val < low){
      return rangeSumBST(root.right, low, high);
   }
   else
       return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high) + root.val;
  
   
   
   
   
   
   
   
   
 //   //Using Recurrsion and traverse Inorder(but you can use any traverse)   
    // if(root == null) return result;

    // if(root.val >= low && root.val <= high){
    //     result += root.val;
    // }
    // rangeSumBST(root.left, low, high);
    // rangeSumBST(root.right, low, high);

    // return result;

    
        
    }
}