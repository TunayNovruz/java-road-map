/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.bfs;

public class NumberOfIslands {


    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    explore(row, col, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public static void explore(int row, int col, char[][] arr) {
        arr[row][col] = '0';
        if (isSafe(row, col + 1, arr))
            explore(row, col + 1, arr);
        if (isSafe(row + 1, col, arr))
            explore(row + 1, col, arr);
        if (isSafe(row - 1, col, arr))
            explore(row - 1, col, arr);
        if (isSafe(row, col - 1, arr))
            explore(row, col - 1, arr);

    }

    public static boolean isSafe(int row, int col, char[][] arr) {
        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length)
            return false;
        return arr[row][col] == '1';
    }

}
