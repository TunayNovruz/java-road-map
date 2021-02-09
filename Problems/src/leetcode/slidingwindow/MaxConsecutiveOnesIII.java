/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.slidingwindow;

public class MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    public static int longestOnes(int[] A, int K) {
        if (K >= A.length) return A.length;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (K == 0 && A[i] == 0) continue;
            int count = 0;
            int zeroCount = K;
            for (int j = i; j < A.length; j++) {
                if (A[j] == 0) zeroCount--;
                if (zeroCount < 0) break;
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
