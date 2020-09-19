
//Time = O(N)
//SPace = O(1)
import java.util.*;

public class LevelOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public void levelOrderIter(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.println(cur.val);
            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);

        }

    }

    public void levelOrdeRecur(TreeNode root) {
        if (root == null)
            return;
        for (int i = 1; i < findHeight(root); i++) {
            printLevel(root, i);
        }

    }

    public void printLevel(TreeNode root, int level) {
    if(root == null) return;
    if(level == 1) System.out.println(root.val);

    else{
        printLevel(root.left, level - 1);
        printLevel(root.right, level - 1);
    }
    }

    public int findHeight(TreeNode root) {

        if (root == null)
            return 1;
        int l = findHeight(root.left);
        int r = findHeight(root.right);
        return Math.max(l, r) + 1;
    }

    public static void main(String args[]) {
        LevelOrder obj = new LevelOrder();

        TreeNode tree = new TreeNode(50);
        tree.left = new TreeNode(30);
        tree.right = new TreeNode(70);
        tree.left.right = new TreeNode(40);
        tree.left.left = new TreeNode(20);
        tree.right.left = new TreeNode(60);
        tree.right.right = new TreeNode(80);

       // obj.levelOrderIter(tree);
       obj.levelOrdeRecur(tree);

    }
}
