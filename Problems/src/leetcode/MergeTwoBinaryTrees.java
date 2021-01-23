/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class MergeTwoBinaryTrees {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode temp = new TreeNode();
        if (t1 != null && t2 != null) {
            temp.val = t1.val + t2.val;
            temp.left = mergeTrees(t1.left, t2.left);
            temp.right = mergeTrees(t1.right, t2.right);
        } else if (t1 == null && t2 != null) {
            temp.val = t2.val;
            temp.left = mergeTrees(null, t2.left);
            temp.right = mergeTrees(null, t2.right);
        } else if (t1 != null) {
            temp.val = t1.val;
            temp.left = mergeTrees(t1.left, null);
            temp.right = mergeTrees(t1.right, null);
        } else {
            return null;
        }
        return temp;
    }


}
