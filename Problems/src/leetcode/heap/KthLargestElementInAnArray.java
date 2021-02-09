/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n : nums)
            heap.add(n);

        while (k > 0) {
            int res = heap.remove();
            k--;
            if (k == 0)
                return res;
        }
        return 0;
    }

    public int secondWayfindKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
