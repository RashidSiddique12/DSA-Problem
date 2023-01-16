package LinkedList;

import java.util.*;
import java.io.*;
import java.lang.*;

class Nodee{
        int data;
        Nodee prev;
        Nodee next;
        Nodee(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
  
class DoubleLinkedList{ 
    
    public static void main(String args[]) 
    { 
        Nodee  head = new Nodee(10);
        Nodee temp1 = new Nodee(20);
        Nodee temp2 = new Nodee(30);
        Nodee temp3 = new Nodee(40);
        Nodee temp4 = new Nodee(50);
        
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.next = temp3;
        temp2.prev = temp1;
        temp3.next = temp4;
        temp3.prev = temp2;
        temp4.prev = temp3;
        
        printlist(head);
    	
    } 
    
    public static void printlist(Nodee head){
        Nodee curr=head;
        while(curr!=null){
        System.out.print(curr.data+"<==>");
        curr=curr.next;
    }System.out.println();
    }
} 