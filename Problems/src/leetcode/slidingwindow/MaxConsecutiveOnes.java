/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.slidingwindow;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) max = Math.max(max, ++count);
            if (num == 0) count = 0;
        }
        return max;
    }
}
