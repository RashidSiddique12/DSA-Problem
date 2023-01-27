//https://leetcode.com/problems/linked-list-cycle-ii/description/?envType=study-plan&id=level-1

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }

        if(fast == null || fast.next == null) return null;

        slow = head; //fast = fast
        while(slow !=  fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

        
    }
}