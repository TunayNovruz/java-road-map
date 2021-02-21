/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> q1 = new ArrayDeque<>();
        TreeNode temp;
        q1.offer(root);
        while (!q1.isEmpty()) {
            temp = q1.poll();
            if (set.contains(temp.val)) return true;
            set.add(k - temp.val);
            if (temp.left != null) q1.offer(temp.left);
            if (temp.right != null) q1.offer(temp.right);
        }
        return false;
    }
}
