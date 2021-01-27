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

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(2, null, new TreeNode(3)));
        System.out.println(isSymmetric(node));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;

        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        q1.offer(root);
        while (!q1.isEmpty()) {
            TreeNode node = q1.poll();
            if (node != null) {
                l1.add(node.val);
                q2.offer(node.left);
                q2.offer(node.right);
            } else l1.add(null);


            if (q1.isEmpty()) {
                System.out.println(l1);
                for (int i = 0; i < l1.size(); i++) {
//                    if (!list.get(i).equals(list.get(list.size() - 1 - i)))
//                        return false;
                }
                l1.clear();
                while (!q2.isEmpty()) {
                    TreeNode node2 = q2.poll();
                    if (node2 != null) {
                        l2.add(node2.val);
                        q1.add(node2.right);
                        q1.add(node2.left);
                    } else l2.add(null);
                }
                System.out.println(l2);
                for (int i = 0; i < l2.size(); i++) {
//                    if (!list.get(i).equals(list.get(list.size() - 1 - i)))
//                        //return false;
                }
                l2.clear();
            }
        }
        return true;
    }
}
