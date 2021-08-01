/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        for (int i = nums.length - 1; i > k - 1; i--) {
            int temp = nums[i];
            nums[i] = nums[i - k];
            nums[i - k] = temp;
        }
    }
}
