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


public class printleftViewOfBTM2 {
    
    public static void main(String[] args) {  
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(100);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.left= new Node(60);
        root.right.right = new Node(70);
        
        printLeftView(root);
    }
    public static void printLeftView(Node root){
        if(root == null) return ;
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            for(int i=0; i<count; i++){
                Node curr = q.poll();
                if(i==0){
                    System.out.print(curr.key + " ");
                }
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            
        }
    }
}
