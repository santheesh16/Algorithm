package BinaryTree;

public class TreeMinValue {

    public static Double treeMinValue(Node<Double> root) {
        if (root == null) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) Math.min(root.val, Math.min(treeMinValue(root.left), treeMinValue(root.right)));
    }

    public static void main(String[] args) {
        Node<Double> a = new Node<>(3.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(4.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(-2.);
        Node<Double> f = new Node<>(1.);

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

        System.out.println(treeMinValue(a)); // -> -2
    }

}
