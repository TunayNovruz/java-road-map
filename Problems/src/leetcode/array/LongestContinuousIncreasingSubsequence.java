/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.array;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int sequence = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                max = Math.max(sequence, max);
                sequence = 1;
            } else sequence++;
        }

        return Math.max(sequence, max);
    }
}
