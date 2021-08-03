/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    private final int n;
    Queue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        n = k;
        heap = new PriorityQueue<Integer>();


        for (int i = 0; i < nums.length && i < k; i++) {
            heap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > heap.peek()) {
                heap.remove();
                heap.offer(nums[i]);
            }
        }
    }

    public int add(int val) {
        if (heap.size() < n) heap.offer(val);
        else if (val > heap.peek()) {
            heap.poll();
            heap.offer(val);
        }
        return heap.peek();
    }
}