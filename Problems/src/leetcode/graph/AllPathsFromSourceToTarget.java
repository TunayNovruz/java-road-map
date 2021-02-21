/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        for (int n : graph[0]) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(n);
            dfs(n, graph, list);
        }
        return result;
    }

    public void dfs(int index, int[][] graph, List<Integer> list) {
        if (graph[index].length == 0) {
            if (index == graph.length - 1)
                result.add(new ArrayList<>(list));
            return;
        }
        for (int n : graph[index]) {
            list.add(n);
            dfs(n, graph, list);
            list.remove(Integer.valueOf(n));
        }
    }
}
