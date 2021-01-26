/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.array;

//todo leetcode time limit exceed

public class SubarrayProductLessThanK {
    public static int count;

    public static void main(String[] args) {
        System.out.println("res:" + numSubarrayProductLessThanK(new int[]{1, 1, 1, 1, 1, 1, 1, 6}, 100));
    }

    public static void find(int pos, int total, int[] nums, int k) {
        if (total >= k || pos > nums.length - 1)
            return;
        count++;
        if (pos + 1 <= nums.length - 1)
            find(pos + 1, total * nums[pos + 1], nums, k);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        if (min > k)
            return 0;

        if (max == 1 && k > 1)
            return nums.length * (nums.length + 1) / 2;
        // n * (n + 1) /2
        // 5 * 6 / 2 = 15

        for (int i = 0; i < nums.length; i++) {
            find(i, nums[i], nums, k);
        }
        return count;
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

}
