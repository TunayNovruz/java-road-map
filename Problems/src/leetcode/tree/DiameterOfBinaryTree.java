/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

public class DiameterOfBinaryTree {
    public int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int l = dfs(node.left);
        int r = dfs(node.right);
        if (l + r > max)
            max = l + r;
        return l > r ? l + 1 : r + 1;
    }
}
