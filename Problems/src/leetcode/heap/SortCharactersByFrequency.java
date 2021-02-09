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

public class SortCharactersByFrequency {

    public static void main(String[] args) {
        System.out.println(frequencySort("saaalam"));
    }

    public static String frequencySort(String s) {
        if (s.length() <= 2)
            return s;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, "") + c);
        }
        class StringLengthComparator implements Comparator<String> {
            public int compare(String x, String y) {
                if (x.length() < y.length()) return 1;
                if (x.length() > y.length()) return -1;
                return 0;
            }
        }
        PriorityQueue<String> heap = new PriorityQueue<>(map.size(), new StringLengthComparator());
        heap.addAll(map.values());
        StringBuilder result = new StringBuilder();
        while (heap.size() > 0)
            result.append(heap.remove());
        return result.toString();
    }
}
