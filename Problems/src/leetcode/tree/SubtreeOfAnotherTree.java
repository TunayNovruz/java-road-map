/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        return compareTwoTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean compareTwoTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        else if ((t1 == null || t2 == null))
            return false;
        else if (t1.val != t2.val)
            return false;
        return compareTwoTree(t1.left, t2.left) && compareTwoTree(t1.right, t2.right);
    }
}
