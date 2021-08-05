/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class NaryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        addChildren(root, list);
        return list;
    }

    private void addChildren(Node node, List<Integer> list) {
        list.add(node.val);
        if (node.children != null)
            for (Node child : node.children)
                addChildren(child, list);
    }

    public List<Integer> preorderBFS(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        if (root.children == null) return list;

        Queue<List<Node>> q1 = new ArrayDeque<>();
        Queue<List<Node>> q2 = new ArrayDeque<>();
        q1.offer(root.children);
        while (!q1.isEmpty()) {
            List<Node> temp = q1.poll();
            for (Node child : temp) {
                list.add(child.val);
                if (child.children != null)
                    q2.offer(child.children);
            }

            if (q1.isEmpty()) {
                while (!q2.isEmpty()) {
                    List<Node> temp2 = q2.poll();
                    for (Node child : temp2) {
                        list.add(child.val);
                        if (child.children != null)
                            q1.offer(child.children);
                    }
                }
            }
        }
        return list;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
