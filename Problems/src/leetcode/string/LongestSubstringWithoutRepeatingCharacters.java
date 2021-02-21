/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        int max = 0;
        for (char c : chars) {
            if (list.contains(c)) {
                max = Math.max(list.size(), max);
                list.subList(0, list.indexOf(c) + 1).clear();
            }
            list.add(c);
        }
        return Math.max(list.size(), max);
    }
}
