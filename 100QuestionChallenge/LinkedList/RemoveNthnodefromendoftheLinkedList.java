import java.util.Scanner;

class RemoveNthnodefromendoftheLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    //
    public static Node removeNthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // to check may be fast is on null
        if (fast == null)
            return slow.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;

    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Node number you want to delete from the last");
        int n = sc.nextInt();

        Node newhead = removeNthNode(head, n);

        // to print the LinkList
        Node curr = newhead;
        while (curr != null) {
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }

    }
}