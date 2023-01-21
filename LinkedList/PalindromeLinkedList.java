//https://leetcode.com/problems/palindrome-linked-list/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {


        
        ArrayList <Integer> list = new ArrayList<>();
        ListNode curr = head;

        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }

        int front = 0;
        int back = list.size() -1;
        while(front < back){
            if(list.get(front) != list.get(back))
            {
                return false;
            }
            front++;
            back--;
        }
        return true;

    // BETTER SOLUTION
    // public ListNode reverse(ListNode head){
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while(curr != null)
    //     {
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }
    
    // public ListNode middle(ListNode head)
    // {
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     while(fast.next != null && fast.next.next != null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }
    // public boolean isPalindrome(ListNode head) {
    //     if(head == null || head.next == null)
    //     {
    //         return true;
    //     }
    //     ListNode middle = middle(head);
    //     ListNode second = reverse(middle.next);
    //     ListNode first = head;
    //     while(second != null)
    //     {
    //         if(first.val != second.val)
    //         {
    //             return false;
    //         }
    //         first = first.next;
    //         second = second.next;
    //     }
    //     return true;
        
        
    }
}