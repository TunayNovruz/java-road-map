/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 0) return 0;
        if (x <= 3) return 1;
        long left = 1;
        long right = x;
        long pow, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            pow = mid * mid;
            if (pow == x) return (int) mid;
            else if (pow < x) left = mid + 1;
            else right = mid;
        }

        return (int) left - 1;
    }
}
