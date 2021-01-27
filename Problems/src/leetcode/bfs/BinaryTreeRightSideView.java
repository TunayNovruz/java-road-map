/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.bfs;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        q1.offer(root);
        while (!q1.isEmpty()) {
            TreeNode node = q1.poll();
            if (q1.size() == 0) list.add(node.val);
            if (node.left != null) q2.offer(node.left);
            if (node.right != null) q2.offer(node.right);

            if (q1.isEmpty())
                while (!q2.isEmpty()) {
                    TreeNode node2 = q2.poll();
                    if (q2.size() == 0) list.add(node2.val);
                    if (node2.left != null) q1.offer(node2.left);
                    if (node2.right != null) q1.offer(node2.right);
                }

        }
        return list;
    }
}
