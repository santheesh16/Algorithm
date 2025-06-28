package Blind75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import DSA.Trees.TreeNode;

public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue != null) {
            int n = queue.size();
            List<Integer> newLevel = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.pop();
                newLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                res.add(newLevel);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5, null, null);
        Integer[] root = new Integer[] { 3, 9, 20, null, null, 15, 7 };

        TreeNode treeNode1 = treeNode.buildTree(root);
        treeNode.printTree(treeNode1);
    }
}
