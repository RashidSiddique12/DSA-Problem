public class MergeTwoSortedLinkedLists {

    public static class Node {
        Node next;
        int data;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node merg(Node head1, Node head2) {

        Node dummyNode = new Node(0);
        Node curr = dummyNode;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        while (head1 != null) {
            curr.next = head1;
            head1 = head1.next;
            curr = curr.next;
        }
        while (head2 != null) {
            curr.next = head2;
            head2 = head2.next;
            curr = curr.next;
        }

        return dummyNode.next;

    }

    // printing
    public static void print(Node head) {

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);

        head1.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        Node head11 = new Node(15);
        Node temp11 = new Node(25);
        Node temp22 = new Node(35);
        Node temp33 = new Node(45);
        Node temp44 = new Node(55);

        head11.next = temp11;
        temp11.next = temp22;
        temp22.next = temp33;
        temp33.next = temp44;

        Node head = merg(head1, head11);

        print(head);
    }
}
