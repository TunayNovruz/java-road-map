/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class UniqueBinarySearchTrees {

    public static int count = 0;
    public static Set<String> keys = new HashSet<>();

    public static void main(String[] args) {


        System.out.println("result: " + numTrees(4));
    }

    public static int numTrees(int n) {

        if (n == 1)
            return 1;

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            find(i, n, stack, new TreeNode(i));
            keys.clear();
            stack.pop();
        }

        return count;
    }

    public static void find(int num, int n, Stack<Integer> stack, TreeNode node) {

        if (stack.size() == n) {
//            System.out.println(stack);
//            TreeNode.printTree(node);
            String key = treeToString("", node);
            System.out.println(key);
            if (!keys.contains(key)) {
                count++;
                keys.add(key);
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (stack.contains(i)) continue;
            stack.push(i);
            addNewNode(node, i);
            find(i, n, stack, node);
            removeNode(node, i);
            stack.pop();
        }
    }

    public static void addNewNode(TreeNode root, int num) {
        if (num < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(num);
                return;
            }
            addNewNode(root.left, num);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(num);
                return;
            }
            addNewNode(root.right, num);
        }
    }

    public static void removeNode(TreeNode root, int num) {
        if (num > root.val) {
            if (root.right != null && root.right.val == num)
                root.right = null;
            else if (root.right != null)
                removeNode(root.right, num);
        } else {
            if (root.left != null && root.left.val == num)
                root.left = null;
            else if (root.left != null)
                removeNode(root.left, num);
        }
    }

    public static String treeToString(String str, TreeNode node) {

        str += node.val;
        if (node.left != null)
            str = treeToString(str, node.left);
        if (node.right != null)
            str = treeToString(str, node.right);

        return str;
    }

}
