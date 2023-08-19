public class Add1toaNumberRepresentedLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node addOne(Node head) {

        Node revhead = reverse(head);

        int curry = 1;
        Node curr = revhead;
        Node prev = null;
        while (curr != null) {
            if (curr.data < 9) {
                curr.data = curr.data + curry;
                curry = 0;
                break;
            }

            curr.data = 0;
            prev = curr;
            curr = curr.next;
        }

        if (curry > 0) {
            prev.next = new Node(curry);
        }

        return reverse(revhead);
    }

    // reverse the linklist

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

        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        Node newhead = addOne(head);

        Node curr = newhead;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

    }
}
