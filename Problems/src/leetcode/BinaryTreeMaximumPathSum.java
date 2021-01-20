/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

//todo unsolved
public class BinaryTreeMaximumPathSum {
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {

    }

    public static int findMax(TreeNode node) {

        max = Math.max(node.val, max);
        if (node.left == null && node.right == null) {
            return node.val;
        } else if (node.left != null && node.right == null) {
            int left = findMax(node.left);
            max = Math.max(left + node.val, max);
            return left + node.val;
        } else if (node.left == null) {
            int right = findMax(node.right);
            max = Math.max(right + node.val, max);
            return right + node.val;
        } else {
            int right = findMax(node.right);
            int left = findMax(node.left);

            max = Math.max(left + node.val, max);
            max = Math.max(right + node.val, max);
            max = Math.max(left + right + node.val, max);
            max = Math.max(node.left.val + node.right.val + node.val, max);

            if (left > right) {
                max = Math.max(left, max);
                return left + node.val;
            } else {
                max = Math.max(right, max);
                return right + node.val;
            }
        }
    }

    public int maxPathSum(TreeNode root) {
        int left = findMax(root);
        return max;
    }
}
