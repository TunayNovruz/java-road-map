/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.bitmanuplation;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length - 1)) / 2;
        int total = 0;
        for (int n : nums)
            total += n;
        return sum - total;
    }
}
