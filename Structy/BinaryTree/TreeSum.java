package BinaryTree;

import java.util.ArrayDeque;

public class TreeSum {

    public static int treeSumDFSRecurion(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        return root.val + treeSumDFSRecurion(root.left) + treeSumDFSRecurion(root.right);
    }

    public static int treeSumBFS(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        ArrayDeque<Node<Integer>> queue = new ArrayDeque<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node<Integer> node = queue.pop();
                res += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(4);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        // 3
        // / \
        // 11 4
        // / \ \
        // 4 -2 1

        System.out.println(treeSumBFS(a)); // -> 21

    }

}
