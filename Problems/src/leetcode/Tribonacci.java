/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

public class Tribonacci {

    public int tribonacci(int n) {
        int[] dyno = new int[n];
        return trib(n, dyno);
    }

    public int trib(int n, int[] dyno) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        if (dyno[n] == 0)
            dyno[n] = trib(n - 1, dyno) + trib(n - 2, dyno) + trib(n - 3, dyno);

        return dyno[n];
    }
}
