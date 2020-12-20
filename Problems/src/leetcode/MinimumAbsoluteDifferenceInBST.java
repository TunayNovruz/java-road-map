/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

public class MinimumAbsoluteDifferenceInBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(7);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(1);


        Solution s = new Solution();

        int mindiff = s.getMinimumDifference(root);
        System.out.println("mindff: " + mindiff);


        printTree(root);
    }

    public static void printTree(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }
}

class Solution {
    public int getMinimumDifference(TreeNode root) {

        int min = Integer.MAX_VALUE;
        min = findDiff(root, root, min);
        return min;
    }

    public int findDiff(TreeNode root, TreeNode node, int min) {
        if (node == null)
            return min;
        min = findDiff(root, node.left, min);
        node.left = null;
        min = findDiff(root, node.right, min);
        node.right = null;
        min = compareTree(root, node, min);
        return min;
    }

    public int compareTree(TreeNode root, TreeNode node, int min) {
        if (root == null || root == node)
            return min;
        System.out.println(node.val + "=>" + root.val);
        int diff = Math.abs(root.val - node.val);
        if (diff < min) {
            min = diff;
        }
        min = compareTree(root.left, node, min);
        min = compareTree(root.right, node, min);
        return min;
    }
}
