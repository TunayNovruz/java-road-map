/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = new TreeNode(root.val);
        temp.right = invertTree(root.left);
        temp.left = invertTree(root.right);
        return temp;
    }
}
