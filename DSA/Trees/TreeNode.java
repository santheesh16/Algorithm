package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Insert value into BST
    public TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void printTree(TreeNode root) {
        printTree(root, 0);
    }

    public void printTree(TreeNode node, int level) {
        if (node == null)
            return;

        printTree(node.right, level + 1);

        System.out.println("    ".repeat(level) + node.val);

        printTree(node.left, level + 1);
    }

    public TreeNode buildBSTTree(Integer[] values) {
        if (values.length == 0) {
            return new TreeNode();
        }
        TreeNode root = new TreeNode();
        for (Integer val : values) {
            if (val != null) {
                root = insert(root, val);
            }
        }
        return root;
    }

    public TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null)
            return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < values.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < values.length && values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

}
