/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{3, 2, 1});
        for (List<Integer> res : result) {
            for (Integer a : res) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            var checked = new HashMap<Integer, Boolean>();
            var temp = new ArrayList<Integer>();
            findCombinations(nums, temp, checked, i, result);
        }
        return result;
    }

    public static void findCombinations(int[] nums, ArrayList<Integer> temp, HashMap<Integer, Boolean> checked, int index, List<List<Integer>> result) {
        if (temp.size() == nums.length - 1) {
            temp.add(nums[index]);
            result.add(new ArrayList<Integer>(temp));
            temp.remove(temp.size() - 1);
            return;
        }

        checked.put(index, true);
        temp.add(nums[index]);
        for (int k = 0; k < nums.length; k++) {
            if (checked.get(k) != null)
                continue;
            findCombinations(nums, temp, checked, k, result);
        }
        checked.remove(index);
        temp.remove(temp.size() - 1);

    }
}
