/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int rowLeft = 0;
        int rowRight = matrix.length - 1;
        int rowLen = matrix[0].length - 1;
        while (rowLeft <= rowRight && target >= matrix[rowLeft][0] && target <= matrix[rowRight][rowLen]) {
            int mid = rowLeft + (rowRight - rowLeft) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][rowLen]) {
                int colLeft = 0;
                int colRight = rowLen;
                while (colLeft <= colRight) {
                    int colMid = colLeft + (colRight - colLeft) / 2;
                    if (target == matrix[mid][colMid])
                        return true;
                    else if (target > matrix[mid][colMid])
                        colLeft = colMid + 1;
                    else colRight = colMid - 1;
                }
                return false;
            } else if (target > matrix[mid][rowLen])
                rowLeft = mid + 1;
            else if (target < matrix[mid][0])
                rowRight = mid - 1;
        }
        return false;
    }
}
