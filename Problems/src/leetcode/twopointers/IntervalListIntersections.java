/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

    public static void main(String[] args) {
       /* int[][] f = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] s = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};*/

        int[][] f = {{8, 15}};
        int[][] s = {{1, 5}, {8, 10}, {12, 20}};

       /* int[][] f = {{14, 16}};
        int[][] s = {{1, 5}, {16, 20}};*/
        int[][] res = intervalIntersection(f, s);
        for (int[] r : res) {
            System.out.println("[" + r[0] + "," + r[1] + "]");
        }
    }

    public static int[][] intervalIntersection(int[][] first, int[][] second) {
        if (first.length == 0 || second.length == 0)
            return new int[][]{};
        int len = Math.min(first.length, second.length);
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (i < first.length && i < second.length) {
                int min = Math.max(first[i][0], second[i][0]);
                int max = Math.min(first[i][1], second[i][1]);
                if (min <= max)
                    list.add(new int[]{min, max});
            }
            if (i < second.length - 1 && second[i + 1][0] <= first[i][1])
                list.add(new int[]{second[i + 1][0], first[i][1]});

            if (i < first.length - 1 && first[i + 1][0] <= second[i][1])
                list.add(new int[]{first[i + 1][0], second[i][1]});
        }

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
