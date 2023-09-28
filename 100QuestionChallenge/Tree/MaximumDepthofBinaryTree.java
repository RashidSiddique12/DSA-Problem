class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

class MaximumDepthofBinaryTree {
    public static int height(TreeNode root) {
        if (root == null)
            return 0;

        int lf = height(root.left);
        int rg = height(root.right);

        return 1 + Math.max(lf, rg);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(25);

        int height = height(root);
        System.out.println(height);

    }

}