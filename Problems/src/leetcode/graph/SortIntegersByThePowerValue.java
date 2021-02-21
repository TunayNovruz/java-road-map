/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.graph;

public class SortIntegersByThePowerValue {
    public int getKth(int lo, int hi, int k) {
        int[][] res = new int[hi - lo + 1][2];
        int i = 0;
        while (lo <= hi) {
            int pow = find(lo, 0);
            res[i++] = new int[]{pow, lo};
            lo++;
        }
        for (int j = 0; j < res.length; j++) {
            for (int l = 0; l < res.length; l++) {
                if (res[l][0] > res[l + 1][0]) {
                    int[] temp = res[l];
                    res[l] = res[l + 1];
                    res[l + 1] = temp;
                }
            }
        }
        return res[k - 1][1];
    }

    public int find(int num, int count) {
        if (num % 2 == 0) return find(num / 2, ++count);
        if (num == 1) return count;
        return find(3 * num + 1, ++count);
    }
}
