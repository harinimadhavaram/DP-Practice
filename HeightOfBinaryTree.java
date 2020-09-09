public class HeightOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public int findHeight(TreeNode root) {
        if (root == null)
            return 0;
        int left = findHeight(root.left);
        int right = findHeight(root.right);

        return Math.max(left, right) + 1;

    }

    public static void main(String args[]) {
        HeightOfBinaryTree obj = new HeightOfBinaryTree();
        TreeNode tree = new TreeNode(50);
        tree.left = new TreeNode(30);
        tree.right = new TreeNode(70);
        tree.left.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.right.left = new TreeNode(1);
        tree.right.right = new TreeNode(4);
        System.out.println(obj.findHeight(tree));

    }
}
