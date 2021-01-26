/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }

    public static TreeNode insertNode(TreeNode node, int val) {
        if (node == null)
            return new TreeNode(val);
        node.right = insertNode(node.right, val);
        return node;
    }

}