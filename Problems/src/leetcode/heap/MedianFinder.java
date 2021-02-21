/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

public class MedianFinder {
    public int[] shuffle(int[] nums, int n) {
        if (nums.length == 0) return null;
        int[] res = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            res[k++] = nums[i];
            if (n < nums.length)
                res[k++] = nums[n++];
        }
        return res;
    }
}
