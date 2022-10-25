class Node{
    int key;
    Node left;
    Node right;
    Node (int k){
        key = k;
        left = right = null;
    }
}

public class convertBtToDLL{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        
        Node head = BtToDLL(root);
        printList(head);
    }
    static Node prev = null;
    public static Node BtToDLL(Node root){
        if(root == null) return root;

        Node head = BtToDLL(root.left);
        if(prev == null){ head = root; }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BtToDLL(root.right);
        return head;
    }
    public static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key + " ");
            curr = curr.right;
            
        }
    }

}