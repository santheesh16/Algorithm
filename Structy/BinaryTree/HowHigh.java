package BinaryTree;

public class HowHigh {
    public static <T> int howHigh(Node<T> root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(howHigh(root.left), howHigh(root.right));
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

        howHigh(a); // -> 2

    }
}
