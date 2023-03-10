//https://leetcode.com/problems/linked-list-random-node/description/

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
    ArrayList<Integer> list = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;

        }
    }
    
    public int getRandom() {
        int res = (int)(Math.random()*list.size());
        return list.get(res);
    }
}