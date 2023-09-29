import java.util.*;

class Node {
    Node left;
    Node right;
    int val;

    Node(int x) {
        val = x;
        left = right = null;
    }
}

public class FlipBinaryTree {

    // print the level order traversal
    public static void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                System.out.print(curr.val + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }

    }

    // flip the binary treee
    public static Node flipBinaryTree(Node root) {
        if (root == null)
            return root;
        if (root.left == null && root.right == null)
            return root;

        Node flipNode = flipBinaryTree(root.left);

        root.left.left = root.right;
        root.left.right = root;
        root.left = root.right = null;
        return flipNode;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("Print Level Order Traversal : ");
        levelOrderTraversal(root);

        Node newRoot = flipBinaryTree(root);

        System.out.println("Print After Flip Binary Tree Level Order Traversal : ");
        levelOrderTraversal(newRoot);

    }

}
