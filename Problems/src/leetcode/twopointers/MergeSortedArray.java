/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int[] merge = new int[m + n];
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < m + n; i++) {
            if (p2 < n && nums2[p2] < nums1[p1]) {
                merge[i] = nums2[p2];
                p2++;
            } else if (p1 < m) {
                merge[i] = nums1[p1];
                p1++;
            }

        }

        for (int num : merge) {
            System.out.println(num);
        }
        nums1 = merge;
    }
}
