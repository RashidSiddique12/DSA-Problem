class Node {
    Node left;
    Node right;
    int val;

    Node(int x) {
        val = x;
        left = right = null;
    }
}

public class IfTwoTreeshaveSamestructure {

    public static boolean checkSameStructure(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 != null && root2 != null) {
            return (checkSameStructure(root1.left, root2.left) && checkSameStructure(root1.right, root2.right));
        }

        return false;
    }

    public static void main(String[] args) {

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.left = new Node(5);
        // root1.left.left.left = new Node(78);

        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);
        root2.left.left = new Node(40);
        root2.left.left = new Node(50);

        boolean res = checkSameStructure(root1, root2);
        System.out.println(res);

    }
}
