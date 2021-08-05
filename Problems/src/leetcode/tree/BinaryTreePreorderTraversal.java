/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addNode(root, list);
        return list;
    }

    private void addNode(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        addNode(node.left, list);
        addNode(node.right, list);
    }
}
