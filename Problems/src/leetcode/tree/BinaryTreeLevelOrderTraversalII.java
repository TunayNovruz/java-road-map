/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7,
                                new TreeNode(5),
                                new TreeNode(2))));
        List<List<Integer>> res = levelOrderBottom(root);
        System.out.println(res);
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> temp = new ArrayDeque<>();
        List<Integer> tempList = new ArrayList<>();
        main.offer(root);

        while (main.size() > 0) {
            TreeNode node = main.poll();
            tempList.add(node.val);

            if (node.left != null)
                temp.offer(node.left);
            if (node.right != null)
                temp.offer(node.right);

            if (main.size() == 0) {
                main = new ArrayDeque<>(temp);
                list.add(0, new ArrayList<>(tempList));
                tempList.clear();
                temp.clear();
            }
        }

        return list;

    }
}
