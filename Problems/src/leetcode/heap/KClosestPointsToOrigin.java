/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        class arrComp implements Comparator<int[]> {
            public int compare(int[] a1, int[] a2) {
                double sum1 = Math.pow(a1[0], 2) + Math.pow(a1[1], 2);
                double sum2 = Math.pow(a2[0], 2) + Math.pow(a2[1], 2);
                return Double.compare(sum1, sum2);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(K, new arrComp());
        heap.addAll(Arrays.asList(points));
        int[][] res = new int[K][];
        for (int i = 0; i < K; i++) {
            res[i] = heap.remove();
        }
        return res;
    }
}
