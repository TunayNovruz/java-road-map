/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int[] rows : matrix)
            for (int n : rows)
                heap.add(n);
        while (k > 0) {
            int res = heap.remove();
            k--;
            if (k == 0)
                return res;
        }
        return 0;
    }
}
