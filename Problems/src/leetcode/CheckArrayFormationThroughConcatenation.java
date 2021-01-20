/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class CheckArrayFormationThroughConcatenation {

    public static void main(String[] args) {
//        [49,18,16]
//          [[16],[49,16]]
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {

        var found = new HashMap<Integer, Integer[]>();
        outerloop:
        for (int i = 0; i < arr.length; i++) {
            for (int[] piece : pieces) {
                for (int k = 0; k <= i && k < piece.length; k++) {
                    if (piece[k] == arr[i]) {
                        if (found.get(Arrays.hashCode(piece)) != null && (
                                found.get(Arrays.hashCode(piece))[0] + 1 != i
                                        || found.get(Arrays.hashCode(piece))[1] >= k)
                        ) {
                            return false;
                        }
                        found.put(Arrays.hashCode(piece), new Integer[]{i, k});
                        continue outerloop;

                    }
                }
            }
            return false;
        }
        return true;
    }
}
