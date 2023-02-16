
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=study-plan&id=algorithm-i

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        // karna ye hai yaha pe ki fast le ja ke n element pe rakh do from starting se or slow and fast ko ek ek step badate chalo jb fast.next null p hogo tb slow.next = slow.next.next kar dena or hojayega
        for(int i=0; i<n; i++) fast = fast.next;
        if(fast == null) return head.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
        
        
    }
}