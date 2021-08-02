/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String first, String second) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char key = first.charAt(i);
            if (map.containsKey(key)) map.put(key, map.get(key) + 1);
            else map.put(key, 1);
        }

        for (int i = 0; i < second.length(); i++) {
            char secondKey = second.charAt(i);
            if (!map.containsKey(secondKey)) return false;
            if (map.get(secondKey) == 1) map.remove(secondKey);
            else map.put(secondKey, map.get(secondKey) - 1);
        }

        return map.size() == 0;
    }
}
