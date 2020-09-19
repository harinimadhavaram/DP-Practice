import java.util.*;

public class TreeTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public void InorderIter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        if (root == null)
            return;

        while (true) {

            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty())
                    break;
                root = stack.pop();
                System.out.print(root.val + " ");
                root = root.right;
            }

        }

    }

    public void preorderIter(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        if (root == null)
            return;

        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            System.out.print(root.val + " ");

            if (root.right != null)
                stack.push(root.right);
            if (root.left != null)
                stack.push(root.left);

        }

    }

    public void postorderIter(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        if (root == null)
            return;

        while (!stack.isEmpty() && current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {

                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.val);

                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.println(temp.val);
                    }

                } else {
                    current = temp;
                }
            }

        }
    }

    public static void main(String args[]) {
        TreeTraversal obj = new TreeTraversal();

        TreeNode tree = new TreeNode(50);
        tree.left = new TreeNode(30);
        tree.right = new TreeNode(70);
        tree.left.right = new TreeNode(40);
        tree.left.left = new TreeNode(20);
        tree.right.left = new TreeNode(60);
        tree.right.right = new TreeNode(80);
        // System.out.println("Inorder Traversal");
        // obj.InorderIter(tree);
        // System.out.println("\nPreorder Traversal");
        // obj.preorderIter(tree);

        System.out.println("\nPostorder Traversal");
        obj.postorderIter(tree);

    }
}
