package BinaryTree;

public class TreeValueCount {

    public static <T> int treeValueCount(Node<T> root, T target) {
        if (root == null) {
            return 0;
        }
        int match = root.val == target ? 1 : 0;
        return match + treeValueCount(root.left, target) + treeValueCount(root.right, target);
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(12);
        Node<Integer> b = new Node<>(6);
        Node<Integer> c = new Node<>(6);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(6);
        Node<Integer> f = new Node<>(12);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        // 12
        // / \
        // 6 6
        // / \ \
        // 4 6 12

        System.out.println(treeValueCount(a, 6)); // -> 3

    }

}
