package LinkedList;


//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/linked-list-insertion-1587115620

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

public class LinkedListInsertion {
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        if(head == null){
            return temp;
            }
       Node curr = head;
       while(curr.next!=null){
           curr = curr.next;
       }
       curr.next = temp; 
    return head;
    }
}