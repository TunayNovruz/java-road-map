/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.slidingwindow;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        int min = nums.length;
        int pointer = 0;
        int count = 0;
        int i = 0;

        while (true) {
            if (sum >= target) {
                min = Math.min(count, min);
                sum -= nums[pointer++];
                count--;
            } else {
                count++;
                sum += nums[i++];
            }

            if (i == nums.length && sum < target)
                break;

        }
        return min == nums.length && count == min ? 0 : min;
    }
}
