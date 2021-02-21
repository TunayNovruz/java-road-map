/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

public class CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        //second way

        int left = 0;
        int count = 0;

        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= left; j--) {
                if (grid[i][j] > -1) {
                    left = j;
                    break;
                }
                count++;
            }
        }

        return count;

        //brute force
       /*
       int count = grid.length * grid[0].length;
        for (int[] ints : grid)
            for (int anInt : ints) {
                if (anInt < 0) break;
                count--;
            }
        return count;
        */
    }
}
