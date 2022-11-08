
//@https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Tree/problem/level-order-traversal-line-by-line


// public class levelOrderTraversalLBL {

// }

class Level_Order_Traverse {
    // Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        if (node != null) {
            q.add(node);

            while (q.isEmpty() == false) {
                int size = q.size();
                ArrayList<Integer> subList = new ArrayList<Integer>();

                for (int i = 0; i < size; i++) {

                    Node curr = q.poll();

                    subList.add(curr.data);

                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);

                }

                list.add(subList);

            }

        }
        return list;
    }
}