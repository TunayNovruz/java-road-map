/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;


import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Double>> list = new ArrayList<>();
        find(0, root, list);
        List<Double> averages = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            double sum = 0;
            List<Double> temp = list.get(i);
            for (Double d : temp)
                sum += d;
            averages.add(sum / temp.size());
        }

        return averages;
    }

    public void find(int n, TreeNode root, List<List<Double>> list) {
        if (root == null)
            return;

        if (n >= list.size()) {
            List<Double> temp = new ArrayList<>();
            temp.add((double) root.val);
            list.add(n, temp);
        } else {
            List<Double> temp = list.get(n);
            temp.add((double) root.val);
        }

        find(n + 1, root.left, list);
        find(n + 1, root.right, list);
    }
}