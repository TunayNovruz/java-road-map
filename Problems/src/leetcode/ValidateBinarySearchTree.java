/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                5, new TreeNode(4), new TreeNode(6,
                new TreeNode(3),
                new TreeNode(7)
        ));

//        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        if (root.right != null && !checkAllTree(root.val, root.right, false)) {
            return false;
        }

        if (root.left != null && !checkAllTree(root.val, root.left, true))
            return false;

        boolean leftCheck = true;
        if (root.left != null)
            leftCheck = isValidBST(root.left);
        if (!leftCheck)
            return false;

        boolean rightCheck = true;
        if (root.right != null)
            rightCheck = isValidBST(root.right);

        return rightCheck;
    }

    public static boolean checkAllTree(int val, TreeNode node, boolean isLeft) {
        if (node == null)
            return true;

        if (!isLeft && val >= node.val) {
            return false;
        }

        if (isLeft && val <= node.val)
            return false;

        boolean right = true;
        if (node.right != null)
            right = checkAllTree(val, node.right, isLeft);

        if (!right)
            return false;

        boolean left = true;
        if (node.left != null)
            left = checkAllTree(val, node.left, isLeft);
        return left;
    }
}
