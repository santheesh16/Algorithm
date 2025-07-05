package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.xml.transform.Source;

public class LeafList {

    public static <T> List<T> leafList(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        List<T> res = new ArrayList<>();
        if (root.left == null && root.right == null) {
            return List.of(root.val);
        }
        res.addAll(leafList(root.left));
        res.addAll(leafList(root.right));
        return res;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(54);
        Node<Integer> d = new Node<>(20);
        Node<Integer> e = new Node<>(15);
        Node<Integer> f = new Node<>(1);
        Node<Integer> g = new Node<>(3);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = f;
        e.right = g;

        // 5
        // / \
        // 11 54
        // / \
        // 20 15
        // / \
        // 1 3
        System.out.println(leafList(a).toString()); // -> [ "d", "e", "f" ]

    }

}
