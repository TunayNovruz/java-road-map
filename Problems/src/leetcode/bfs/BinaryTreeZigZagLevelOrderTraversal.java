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

public class BinaryTreeZigZagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        q1.offer(root);
        while (!q1.isEmpty()) {
            TreeNode node = q1.poll();
            l1.add(0, node.val);
            if (node.right != null)
                q2.offer(node.right);
            if (node.left != null)
                q2.offer(node.left);

            if (q1.isEmpty()) {
                if (l1.size() > 0)
                    list.add(new ArrayList<>(l1));
                l1.clear();
                while (!q2.isEmpty()) {
                    TreeNode node2 = q2.poll();
                    l1.add(0, node2.val);
                    if (node2.left != null)
                        q1.offer(node2.left);
                    if (node2.right != null)
                        q1.offer(node2.right);
                }
                if (l1.size() > 0)
                    list.add(new ArrayList<>(l1));
                l1.clear();
            }
        }
        return list;
    }
}
