package BinaryTree;

public class TreeIncludes {

    public static boolean treeIncludes(Node<String> root, String target) {
        if (root == null) {
            return false;
        }
        return root.val == target || treeIncludes(root.left, target) || treeIncludes(root.right, target);
    }

    public static void main(String[] args) {

    }

}
