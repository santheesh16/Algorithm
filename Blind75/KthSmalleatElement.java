package Blind75;

import DSA.Trees.TreeNode;

public class KthSmalleatElement {

    int count = 0;
    int ans = -1;

    public void dfs(TreeNode root, int k) {
        if (root == null)
            return;

        dfs(root.left, k);
        count++;
        if (count == k) {
            ans = root.val;
            return;
        }
        dfs(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4, null, null);
        Integer[] root = new Integer[] { 3, 1, 4, null, 2 };

        TreeNode treeNode1 = treeNode.buildBSTTree(root);
        treeNode.printTree(treeNode1);

        System.out.println(new KthSmalleatElement().kthSmallest(treeNode1, 1));
    }
}
