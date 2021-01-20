/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleFullBinaryTrees2 {
    public static void main(String[] args) {
        List<TreeNode> list = allPossibleFBT(7);
        for (TreeNode node : list) {
            TreeNode.printTree(node);
            System.out.println("-----");
        }

    }

    public static List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> list = new ArrayList<>();

        if (N % 2 == 0)
            return list;

    /*
        1 - 5
            1-3
            3-1

        3 - 3

      5 - 1
        3-1
        1-3
    */


        TreeNode root = new TreeNode(0);
        generate(N, list, root);

        return list;
    }

    public static TreeNode generate(int n, List<TreeNode> list, TreeNode root) {

        TreeNode temp = new TreeNode(0);
        if (n == 1) {
            return temp;
        }

        for (int i = 1; i <= n / 2; i += 2) {
            generate(i, list, root.right);
            if (i < n / 2)
                generate(i, list, root.left);
        }

        return temp;
//        root.left = null;
//        root.right = null;

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
