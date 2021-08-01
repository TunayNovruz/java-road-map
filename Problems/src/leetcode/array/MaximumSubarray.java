/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        /*
        * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6
        * */

        //edge cases
        if (nums.length == 0) return 0;

        List<Integer> sums = new ArrayList<>();
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int tempSum = nums[i];
            if (tempSum > max) max = tempSum;
            for (int j = i + 1; j < nums.length; j++) {
                tempSum += nums[i];
                if (tempSum > max) max = tempSum;
            }
        }
        return max;
    }

    private int find(int start, int[] nums) {
        int tempSum = nums[start];
        for (int i = start + 1; i < nums.length; i++)
            tempSum += nums[i];
        return tempSum;
    }
}
