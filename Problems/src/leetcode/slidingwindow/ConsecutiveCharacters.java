/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.slidingwindow;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}
