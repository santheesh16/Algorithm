package BinaryTree;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeLevels {

    public static <T> List<List<T>> treeLevels(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        List<List<T>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<T> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Node<T> node = queue.remove();
                curr.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(curr);
        }
        return res;
    }

    public static <T> List<List<T>> treeLevelsStructy(Node<T> root) {
        if (root == null) {
            return List.of();
        }

        List<List<T>> levels = new ArrayList<>();
        ArrayDeque<SimpleEntry<Node<T>, Integer>> queue = new ArrayDeque<>();
        queue.add(new SimpleEntry<>(root, 0));
        while (!queue.isEmpty()) {
            SimpleEntry<Node<T>, Integer> pair = queue.remove();
            Node<T> node = pair.getKey();
            int level = pair.getValue();

            if (level == levels.size()) {
                ArrayList<T> newList = new ArrayList<>();
                newList.add(node.val);
                levels.add(newList);
            } else {
                levels.get(level).add(node.val);
            }

            if (node.left != null) {
                queue.add(new SimpleEntry<>(node.left, level + 1));
            }
            if (node.right != null) {
                queue.add(new SimpleEntry<>(node.right, level + 1));
            }
        }

        return levels;
    }

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        // a
        // / \
        // b c
        // / \ \
        // d e f

        treeLevels(a); // ->
        // [
        // ['a'],
        // ['b', 'c'],
        // ['d', 'e', 'f']
        // ]

    }

}
