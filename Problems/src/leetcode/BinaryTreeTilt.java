/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTilt {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(findTilt(root));
    }


    public static int findTilt(TreeNode root) {
        List<Integer> diffs = new ArrayList<>();
        findDiff(root, diffs);
        int sum = 0;
        for (int diff : diffs) {
            sum += diff;
        }
        return sum;
    }

    public static int findDiff(TreeNode node, List<Integer> diffs) {
        if (node == null)
            return 0;
        int sumLeft = findDiff(node.left, diffs);
        int sumRight = findDiff(node.right, diffs);
        diffs.add(Math.abs(sumLeft - sumRight));
        return sumRight + sumLeft + node.val;
    }
}
