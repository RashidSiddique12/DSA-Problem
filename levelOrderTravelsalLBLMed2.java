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

public class levelOrderTravelsalLBLMed2 {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left= new Node(60);
        root.right.right = new Node(70);

        printLevelOrderLBL(root);
    }
    
   public static void printLevelOrderLBL(Node root){
    
    if(root == null) return;  // if root null return
    Queue <Node> q = new LinkedList<>(); // making queue
    q.add(root);                         // adding in queue
 
    while(q.isEmpty() == false){          // condition check
        int count = q.size();             // store size of queue in the count // size change every time when it goes in the for loops
        
        for(int i=0; i<count; i++){
            Node curr = q.poll();        // polling node from the queue
            System.out.print(curr.key + " ");   // printing
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        System.out.println();
    }
   }
}
