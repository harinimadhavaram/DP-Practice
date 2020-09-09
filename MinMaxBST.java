public class MinMaxBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    TreeNode root = null;

    void insert(int key) {
        root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.val)
            root.left = insertRec(root.left, key);
        else if (key > root.val)
            root.right = insertRec(root.right, key);
        return root;
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }
    }

    public int findMinIter(TreeNode root) {

        if (root == null)
            return -1;
        else {
            while (root.left != null) {
                root = root.left;
            }
        }
        return root.val;
    }

    public int findMinRec(TreeNode root) {

        if (root == null)
            return -1;
        if (root.left == null)
            return root.val;
 return findMinRec(root.left);
    }
    public int findMaxRec(TreeNode root){
        if(root == null) return -1;
        if(root.right == null) return root.val;

        return findMaxRec(root.right);
    }
    public int findMaxIter(TreeNode root){
        if(root == null) return -1;
        else{
            while(root.right != null){
                root = root.right;

            }
        }
        return root.val;
    }

    public static void main(String args[]) {
        MinMaxBST tree = new MinMaxBST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        // tree.inorderRec(tree.root);
        System.out.println("Min using Iterative = " + tree.findMinIter(tree.root));
        System.out.println("Min using Recursion = " + tree.findMinRec(tree.root));
        System.out.println("Max using Recursion = " + tree.findMaxRec(tree.root));
        System.out.println("Max using Iterative = " + tree.findMaxIter(tree.root));
    }

}
