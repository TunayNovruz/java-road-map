/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];

        Set<Integer> set = new HashSet<>();
        for (int num : nums1)
            set.add(num);
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2)
            if (set.contains(num))
                set2.add(num);
        int[] res = new int[set2.size()];

        Iterator<Integer> it = set2.iterator();
        int i = 0;
        while (it.hasNext())
            res[i++] = it.next();
        return res;
    }
}
