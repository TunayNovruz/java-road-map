/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

import java.util.Stack;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(s);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp.val == t.val && compareTwoTree(temp, t))
                return true;
            if (temp.left != null)
                stack.push(temp.left);
            if (temp.right != null)
                stack.push(temp.right);
        }

        return false;
    }

    public boolean compareTwoTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        else if ((t1 == null || t2 == null))
            return false;
        else {
            if (t1.val != t2.val)
                return compareTwoTree(t1.left, t2) || compareTwoTree(t1.right, t2);
            return compareTwoTree(t1.left, t2.left) && compareTwoTree(t1.right, t2.right);
        }
    }
}
