package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreePathFinder {

    public static <T> List<T> pathFinder(Node<T> root, T target) {
        if (root == null) {
            return List.of();
        }
        if (root.val == target) {
            return List.of(root.val);
        }
        List<T> leftPath = pathFinder(root.left, target);
        if (leftPath != null) {
            List<T> newPath = new ArrayList<>();
            newPath.add(root.val);
            newPath.addAll(leftPath);
            return newPath;
        }
        List<T> rightPath = pathFinder(root.right, target);
        if (rightPath != null) {
            List<T> newPath = new ArrayList<>();
            newPath.add(root.val);
            newPath.addAll(rightPath);
            return newPath;
        }
        return null;
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

        System.out.println(pathFinder(a, "e").toString()); // -> [ "a", "b", "e" ]

    }

}
