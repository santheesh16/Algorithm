package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelAverages {

    public static List<Double> levelAverages(Node<Integer> root) {
        if (root == null) {
            return List.of();
        }
        Queue<Node<Integer>> queue = new ArrayDeque<>();
        List<Double> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            double curr = 0.0d;
            for (int i = 0; i < n; i++) {
                Node<Integer> node = queue.remove();
                curr += node.val;
                if (node.left != null) {
                    queue.add(node.right);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add((double) curr / n);
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

        System.out.println(levelAverages(a).toString()); // -> [ 3., 7.5, 1. ]

    }
}
