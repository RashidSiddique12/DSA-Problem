
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/insert-a-node-in-doubly-linked-list

/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node temp = new Node(data);
		
		if(head_ref == null )
		return;
		
		Node curr = head_ref;
		for(int i=0; i<pos; i++){
		    curr = curr.next;
		}
		if(curr.next == null){
		    temp.next = curr.next;
		    curr.next = temp;
		    temp.prev = curr;
		    
		}
		else{
		    temp.next = curr.next;
		    curr.next.prev = temp;
		    temp.prev = curr;
		    curr.next = temp;
		
		
		}
		return;
		
	}
}