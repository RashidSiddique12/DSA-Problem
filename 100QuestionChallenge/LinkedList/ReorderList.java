class ReorderList {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void reorderList(Node head) {
        if (head == null || head.next == null || head.next.next == null)
            return;

        // to find mid node
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        Node head2 = reverse(slow.next);
        slow.next = null;

        // merg the both list according to the conditon
        merg(head, head2);
    }

    public static void merg(Node head1, Node head2) {
        while (head2 != null) {
            Node temp1 = head1.next;
            Node temp2 = head2.next;

            head1.next = head2;
            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;
        }
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node nextNode = head;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        reorderList(head);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");

    }
}
