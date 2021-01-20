/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

//todo unsolved
public class AllPossibleFullBinaryTrees {

    public static ArrayList<TreeNode> result = new ArrayList<>();

    public static void main(String[] arguments) {
        var res = allPossibleFBT(9);

        for (TreeNode node : res) {
            TreeNode.printTree(node);
            System.out.println("----------------");
        }
    }

    public static void findBfs(int n, TreeNode left, TreeNode right, TreeNode root, boolean add) {
        System.out.println(n);
        if (n < 2) {
            return;
        }
        left.left = new TreeNode(0);
        left.right = new TreeNode(0);
        n = n - 2;
        if (n >= 4) {
            right.left = new TreeNode(0);
            right.right = new TreeNode(0);
            n = n - 2;
            findBfs(n, right.left, right.right, root, n % 2 != 0);

            right.left = null;
            right.right = null;

        }

        findBfs(n, left.left, left.right, root, n % 2 != 0);
        if (n % 2 != 0) {
            left.left = null;
            left.right = null;
        }


        if (n <= 2) {
            System.out.println("=== " + n);
            result.add(treeCopy(root));
        }
    }

    public static void find(int n, TreeNode node, TreeNode root) {

        if (n < 2)
            return;

        node.left = new TreeNode(0);
        node.right = new TreeNode(0);

        if (n == 2)
            result.add(treeCopy(root));

        find(n - 2, node.right, root);
        find(n - 2, node.left, root);

        node.left = null;
        node.right = null;

    }

    public static List<TreeNode> allPossibleFBT(int N) {
        if (N == 1 || N % 2 == 0)
            return result;
        TreeNode root = new TreeNode(0);
        //find(N - 1, root, root);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        findBfs(N - 1, root.left, root.right, root, true);
        return result;
    }

    public static TreeNode treeCopy(TreeNode root) {
        TreeNode leftCopy, rightCopy;
        if (root == null)
            return null;
        leftCopy = treeCopy(root.left);
        rightCopy = treeCopy(root.right);
        return new TreeNode(root.val, leftCopy, rightCopy);
    }

}
