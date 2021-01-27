/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

// TODO UNSOLVED
public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {
        TreeNode.printTree(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9, 7, 6}));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(0, nums.length, nums);
    }

    public static TreeNode buildTree(int start, int end, int[] nums) {
        if (start == end) return null;
        int mid = (end + start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (mid > start)
            node.left = buildTree(start, mid, nums);
        if (end > mid)
            node.right = buildTree(mid + 1, end, nums);
        return node;
    }

    public void addToTree(TreeNode node, int val) {
        if (val > node.val) {
            if (node.right != null)
                addToTree(node.right, val);
            else
                node.right = new TreeNode(val);
        } else if (val < node.val)
            if (node.left != null)
                addToTree(node.left, val);
            else
                node.left = new TreeNode(val);
    }
}
