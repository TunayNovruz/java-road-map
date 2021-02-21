/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.PriorityQueue;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1, 2, 0, 1}));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add(num);
        }
        System.out.println(heap);
        int max = 0;
        int count = 0;
        int prev = heap.remove();
        while (!heap.isEmpty()) {
            int temp = heap.remove();
            int diff = Math.abs(temp - prev);
            if (diff == 1) count++;
            else if (diff > 1) count = 0;
            max = Math.max(max, count);
            prev = temp;
        }
        return max + 1;
    }
}
