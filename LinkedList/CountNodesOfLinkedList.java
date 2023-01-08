package LinkedList;

//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/count-nodes-of-linked-list

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

public class CountNodesOfLinkedList {


    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        int count =0; 
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
}