package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllTreePaths {

    public static <T> List<List<T>> allTreePaths(Node<T> root) {
        List<List<T>> res = _allTreePaths(root);
        for (List<T> path : res) {
            Collections.reverse(path);
        }
        return res;
    }

    public static <T> List<List<T>> _allTreePaths(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        if (root.left == null && root.right == null) {
            List<T> curr = new ArrayList<>();
            curr.add(root.val);
            return List.of(curr);
        }
        List<List<T>> allPaths = new ArrayList<>();
        List<List<T>> leftPaths = _allTreePaths(root.left);
        for (List<T> path : leftPaths) {
            path.add(root.val);
            allPaths.add(path);
        }
        List<List<T>> rightPaths = _allTreePaths(root.right);
        for (List<T> path : rightPaths) {
            path.add(root.val);
            allPaths.add(path);
        }
        return allPaths;
    }

    public static <T> void main(String[] args) {
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

        List<List<String>> res = allTreePaths(a); // ->
        for (List<String> list : res) {
            System.out.println(list.toString());
        }
        // [
        // [ 'a', 'b', 'd' ],
        // [ 'a', 'b', 'e' ],
        // [ 'a', 'c', 'f' ]
        // ]

    }

}
