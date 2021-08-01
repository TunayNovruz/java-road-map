/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

public class MergeSortedArray {
    public void nums1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            while (n >= 0)
                nums1[--n] = nums2[n];
            return;
        }
        int count = m + n - 1;
        n--;
        m--;
        while (m >= 0 && n >= 0)
            if (nums2[n] > nums1[m]) nums1[count--] = nums2[n--];
            else nums1[count--] = nums1[m--];
        while (n >= 0)
            nums1[count--] = nums2[n--];
    }
}
