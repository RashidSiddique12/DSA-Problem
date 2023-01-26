//https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan&id=level-1

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;

        while(list1 !=null && list2 !=null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null){
            curr.next = list1;
        }
        else if(list2 != null){
            curr.next = list2;
        }
    return dummyNode.next;


//2nd Method using Recursion

        // if(list1 == null) return list2;
        // if(list2 == null) return list1;

        // if(list1.val <= list2.val){
        //     list1.next = mergeTwoLists(list1.next, list2);
        //     return list1;
        // }  
        // else{
        //     list2.next = mergeTwoLists(list1, list2.next);
        //     return list2;
        // }      
    }
}