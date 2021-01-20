/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeBFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        List<List<Integer>> xetkes = new ArrayList<>();
        printTree(root, xetkes, 0);

        System.out.println(xetkes);
    }

    public static void printTree(TreeNode node, List<List<Integer>> xetkes, int level) {

        if (node == null)
            return;
        if (xetkes.size() <= level)
            xetkes.add(new ArrayList<>());

        xetkes.get(level).add(node.val);
        printTree(node.left, xetkes, level + 1);
        printTree(node.right, xetkes, level + 1);
    }

    public static void printTreeIterative(TreeNode root) {
        Queue<TreeNode> xetkes = new ArrayDeque<>();

        xetkes.offer(root);

        while (xetkes.size() != 0) {
            TreeNode curr = xetkes.poll();
            System.out.println(curr.val);
            if (curr.left != null)
                xetkes.offer(curr.left);
            if (curr.right != null)
                xetkes.offer(curr.right);
        }

    }
}
