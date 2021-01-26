/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.bfs;

public class SurroundedRegions {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'O', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'O', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'X', 'X', 'X', 'O'}
        };

        solve(board);

        for (char[] t : board) {
            for (char c : t)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public static void solve(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == 'O')
                find(row, 0, board);
            if (board[row][board[row].length - 1] == 'O')
                find(row, board[row].length - 1, board);
        }
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == 'O')
                find(0, col, board);
            if (board[board.length - 1][col] == 'O')
                find(board.length - 1, col, board);
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '*')
                    board[row][col] = 'O';
                else if (board[row][col] == 'O')
                    board[row][col] = 'X';
            }
        }
    }

    public static void find(int row, int col, char[][] arr) {

        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 'X' || arr[row][col] == '*')
            return;
        arr[row][col] = '*';
        find(row + 1, col, arr);
        find(row, col + 1, arr);
        find(row - 1, col, arr);
        find(row, col - 1, arr);

    }
}
