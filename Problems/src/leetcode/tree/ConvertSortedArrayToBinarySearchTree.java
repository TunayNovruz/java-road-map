/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

// TODO UNSOLVED
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {

        int mid = (nums.length - 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        int left = mid - 1, right = mid + 1;
        for (int i = 0; i < mid; i++) {
            if (left >= 0)
                addToTree(root, nums[left--]);
            if (right < nums.length)
                addToTree(root, nums[right++]);
        }

        return root;
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
