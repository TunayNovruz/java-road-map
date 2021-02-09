/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {


    public static void main(String[] args) {
        int[] rs = topKFrequent(new int[]{1, 2, 2, 3, 3, 3, 4, 5, 6}, 2);

        for (int r : rs) {
            System.out.println(r);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        class comp implements Comparator<int[]> {
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(new comp());
        for (Integer key : map.keySet())
            heap.add(new int[]{key, map.get(key)});

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = heap.remove()[0];

        return res;
    }

}
