/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.slidingwindow;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumNumberOfVowels {

    public static void main(String[] args) {
        String s = "sasfasfasasfasfasasfasfasasfasfasasfasfasasfasf";
        maxVowels(s, 5);
    }


    public static int maxVowels(String s, int k) {
        String vows = "aeiou";
        Queue<Character> queue = new ArrayDeque<>(k);
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            queue.offer(temp);
            if (vows.indexOf(temp) >= 0) count++;
            max = Math.max(max, count);
            if (queue.size() == k && vows.indexOf(queue.remove()) >= 0) count--;
        }
        return max;
    }
}
