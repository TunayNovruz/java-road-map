/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        double res = findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4});
        System.out.println(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int mid = (len1 + len2) / 2;
        boolean isEven = true;
        if ((len1 + len2) % 2 != 0)
            isEven = false;


        int p1 = 0;
        int p2 = 0;
        int[] merged = new int[len1 + len2];
        int i;
        for (i = 0; i < len1 + len2; i++) {
            int temp;
            if (p2 == len2 || (p1 < len1 && nums1[p1] < nums2[p2])) {
                temp = nums1[p1];
                p1++;
            } else if (p1 == len1 || (p2 < len2 && nums1[p1] > nums2[p2])) {
                temp = nums2[p2];
                p2++;
            } else {
                temp = nums2[p2];
                p2++;
                merged[i] = nums1[p1];
                i++;
                p1++;
            }
            merged[i] = temp;
        }
//        System.out.println(Arrays.toString(merged));
//        System.out.println(mid);
//        System.out.println(merged[mid]);
        if (!isEven)
            return merged[mid];
        return (merged[mid - 1] + merged[mid]) / 2.0;
    }
}
