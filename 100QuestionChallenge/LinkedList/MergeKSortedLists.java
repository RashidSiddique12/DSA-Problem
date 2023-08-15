import java.util.*;

public class MergeKSortedLists {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    public static Node mergKSortedList(Node lists[]) {

        if (lists == null || lists.length == 0)
            return null;

        int interval = 1;
        while (interval < lists.length) {

            for (int i = 0; i + interval < lists.length; i = i + interval * 2) {
                lists[i] = mergTwoList(lists[i], lists[i + interval]);
            }

            interval = interval * 2;
        }
        return lists[0];

    }

    public static Node mergTwoList(Node l1, Node l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        Node dummyNode = new Node(0);
        Node temp = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        while (l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        while (l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }

        return dummyNode.next;

    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(4);
        head1.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node head3 = new Node(2);
        head3.next = new Node(6);

        Node lists[] = { head1, head2, head3 };

        // merg two two list
        // Node head = mergKSortedList(lists);
        // Node curr = head;

        // brute force
        Node head = mergKSortedListOtherMethod(lists);
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    // BruteFroce
    public static Node mergKSortedListOtherMethod(Node lists[]) {
        List<Integer> l = new ArrayList<>();
        for (Node list : lists) {
            while (list != null) {
                l.add(list.data);
                list = list.next;
            }
        }
        Collections.sort(l);
        Node dummy = new Node(0);
        Node temp = dummy;
        for (int ele : l) {
            temp.next = new Node(ele);
            temp = temp.next;
        }

        return dummy.next;
    }
}
