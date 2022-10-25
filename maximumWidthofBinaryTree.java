import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
    int key;
    Node left;
    Node right;
    Node (int k){
        key = k;  
        left = right =null;     
    }
}


public class maximumWidthofBinaryTree {
    
    public static void main(String[] args) {  
        Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);
        
       System.out.print("Width of Binary Tree is : " +  widthOfBT(root));;
    }
    public static int widthOfBT(Node root){
        if(root == null) return 0 ;
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        int res =0;
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, q.size());
            for(int i=0; i < count; i++){
                Node curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }

            
        }
        return res;
    }
}