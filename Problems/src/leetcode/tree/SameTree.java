/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
