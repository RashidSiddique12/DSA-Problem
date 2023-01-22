package LinkedList;
//https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode intersectionPoint(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(slow != fast) return null;
        slow = head; // and fast = fast phele se hi hai fast pe hai
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null) return null;
        ListNode tail = headA;
        while(tail.next !=null){
            tail = tail.next;
        }

        tail.next = headB;
        ListNode ans = intersectionPoint(headA);
        tail.next = null;


        return ans;



        
    }
}