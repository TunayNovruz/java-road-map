/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] errors = new int[2];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                errors[0] = nums[i];
            }
            sum += nums[i];
        }

        errors[1] = (nums.length * (nums.length - 1)) / 2 - (sum - errors[0]);

        return errors;
    }
}
