/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : stones)
            heap.add(num);
        while (heap.size() > 1) {
            int a = heap.remove();
            int b = heap.remove();
            if (a - b > 0) heap.add(a - b);
        }
        return heap.size() > 0 ? heap.remove() : 0;
    }
}
