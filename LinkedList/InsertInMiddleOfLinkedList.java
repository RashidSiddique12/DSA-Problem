
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/insert-in-middle-of-linked-list

/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = new Node(data);
        temp.next = slow.next;
        slow.next = temp;
        
        return head;
    }
}