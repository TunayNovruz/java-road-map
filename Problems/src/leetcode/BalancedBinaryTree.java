/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        boolean res = isBalanced(root);
        System.out.println(res);
    }

    public static boolean isBalanced(TreeNode root) {
        int isBalanced;
        isBalanced = heightOfTree(root);
        return isBalanced != -1;
    }

    public static int heightOfTree(TreeNode root) {
        if (root == null)
            return 0;

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        if (Math.abs(rh - lh) > 1)
            return -1;
        if (lh == -1 || rh == -1)
            return -1;
        return Math.max(rh, lh) + 1;
    }
}
