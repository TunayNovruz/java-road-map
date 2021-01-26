/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.bfs;

import java.util.ArrayList;
import java.util.List;

public class MaxAreaOfIsland {


    public void explore(int row, int col, int[][] arr, List<Integer> temp) {

        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 0) {
            temp.set(0, temp.get(0) + 1);
            return;
        }
        if (arr[row][col] == 2)
            return;
        arr[row][col] = 2;
        explore(row, col + 1, arr, temp);
        explore(row + 1, col, arr, temp);
        explore(row - 1, col, arr, temp);
        explore(row, col - 1, arr, temp);

    }


    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    explore(row, col, grid, temp);
                    return temp.get(0);
                }
            }
        }
        return max;
    }
}
