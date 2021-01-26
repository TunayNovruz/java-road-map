/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

import leetcode.TreeNode;

import java.util.Stack;

public class SumOfRootToLeafBinaryNumbers {

    public static int sum = 0;

    public static int sumRootToLeaf(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        find(stack, root);
        return sum;
    }

    public static void find(Stack<Integer> stack, TreeNode node) {
        if (node == null)
            return;
        stack.push(node.val);
        if (node.left == null && node.right == null) {
            int n = stack.size() - 1;
            for (int num : stack) {
                sum += Math.pow(2, n) * num;
                n--;
            }
        }
        find(stack, node.left);
        find(stack, node.right);
        stack.pop();
    }
}
