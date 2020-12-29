/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int[] sums = new int[n + 1];
        return climb(n, sums);
    }

    public static int climb(int n, int[] sums) {

        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        if (sums[n] > 0)
            return sums[n];

        sums[n] = climb(n - 1, sums) + climb(n - 2, sums);
        return sums[n];

    }
}
