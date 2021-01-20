/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1,};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int d = 1;
        for (int i = 0; i < nums.length - d; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < nums.length - d; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    System.out.println("inside");
                }
                d++;
                i--;
            }
        }
        return nums.length - (d - 1);
    }
}
