/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(7);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(1);

        TreeNode result = increasingBST(root);

        printTree(result);
    }

    public static void printTree(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }

    public static TreeNode increasingBST(TreeNode root) {
        TreeNode result = null;
        List<Integer> nodes = new ArrayList<>();
        reOrder(root, nodes);
        for (int node : nodes) {
            result = insertNode(result, node);
        }
        return result;
    }

    public static void reOrder(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        reOrder(root.left, result);
        result.add(root.val);
        reOrder(root.right, result);
    }

    public static TreeNode insertNode(TreeNode node, int val) {
        if (node == null)
            return new TreeNode(val);
        node.right = insertNode(node.right, val);
        return node;
    }
}
