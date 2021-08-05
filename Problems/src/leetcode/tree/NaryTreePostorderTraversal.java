/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        addChildren(root, list);
        return list;
    }

    private void addChildren(Node node, List<Integer> list) {
        if (node.children != null)
            for (Node child : node.children)
                addChildren(child, list);
        list.add(node.val);
    }
}
