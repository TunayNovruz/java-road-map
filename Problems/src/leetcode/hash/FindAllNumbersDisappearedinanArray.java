/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            set.add(num);

        for (int i = 1; i <= nums.length; i++)
            if (!set.contains(i))
                list.add(i);
        return list;

    }
}
