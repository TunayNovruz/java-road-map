/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.graph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        Node res = new Node(node.val);
        map.put(node, res);
        for (Node n : node.neighbors)
            res.neighbors.add(cloneGraph(n));
        return res;
    }

}

