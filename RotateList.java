//https://leetcode.com/problems/rotate-list/description/

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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len =0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }

        int r = k % len;
        ListNode slow= head;
        ListNode fast = head;
        int count =1;
        ListNode dum = new ListNode(0);
        dum.next = head;
        while(fast.next !=null){
            fast = fast.next;
            if(count < len - r){
                slow = slow.next;
                count++;
            }
        }
        fast.next = dum.next;
        dum = slow.next;
        slow.next = null;


        return dum;
        
        
    }
}