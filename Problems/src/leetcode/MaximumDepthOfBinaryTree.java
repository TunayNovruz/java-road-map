/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int res = maxDepth(root);
        System.out.println("res" + res);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return (lh > rh ? lh : rh) + 1;
    }
}
