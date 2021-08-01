/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {

        if (n == 0) return 0;
        int f = 5;
        int num = 0;
        while (n / f > 1) {
            num = num + n / f;
            f *= 5;
        }
        return num;
    }
}
