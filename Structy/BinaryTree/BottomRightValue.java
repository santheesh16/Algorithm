package BinaryTree;

import java.util.ArrayDeque;

public class BottomRightValue {

    public static <T> T bottomRightValue(Node<T> root) {
        ArrayDeque<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        Node<T> res = null;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                res = queue.pop();
                if (res.left != null) {
                    queue.add(res.left);
                }
                if (res.right != null) {
                    queue.add(res.right);
                }
            }
        }
        return res.val;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(10);
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
        // 11 10
        // / \ \
        // 4 -2 1

        System.out.println(bottomRightValue(a)); // -> 1

    }

}
