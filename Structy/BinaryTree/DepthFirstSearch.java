package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public static List<String> depthFirstValues(Node<String> root) {
        List<String> values = new ArrayList<>();
        Stack<Node<String>> stack = new Stack<>();

        if (root != null) {
            stack.push(root);
        }
        while (!stack.empty()) {
            Node<String> node = stack.pop();
            values.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return values;
    }

    public static List<String> depthFirstValuesRecursion(Node<String> root) {
        if (root == null) {
            return List.of();
        }

        List<String> values = new ArrayList<>();
        values.add(root.val);
        values.addAll(depthFirstValuesRecursion(root.left));
        values.addAll(depthFirstValuesRecursion(root.right));
        return values;
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

        depthFirstValuesRecursion(a);
        // -> ["a", "b", "d", "e", "c", "f"]

    }

}
