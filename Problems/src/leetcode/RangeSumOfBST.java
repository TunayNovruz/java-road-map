/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

public class RangeSumOfBST {
    public static void main(String[] args) {

    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        sum = findSum(root, sum, low, high);
        return sum;
    }

    public static int findSum(TreeNode node, int sum, int low, int high) {
        if (node == null)
            return sum;
        sum = findSum(node.left, sum, low, high);
        sum = findSum(node.right, sum, low, high);
        if (node.val >= low && node.val <= high)
            sum = sum + node.val;
        return sum;
    }
}
