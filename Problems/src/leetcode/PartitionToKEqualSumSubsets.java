/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

//todo Unsolved
public class PartitionToKEqualSumSubsets {

    public static void main(String[] args) {
        System.out.println(canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0)
            return false;

        int part = sum / k;
        List<List<Integer>> subArrays = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            find(nums, i, k, subArrays);
        }

        return false;
    }

    public static void find(int[] nums, int pos, int k, List<List<Integer>> subArrays) {

        for (int i = pos; i < nums.length; i++) {

        }
    }
}
