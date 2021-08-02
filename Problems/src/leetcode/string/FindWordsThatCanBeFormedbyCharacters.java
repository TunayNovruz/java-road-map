/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        if (words.length == 0 || chars.length() == 0) return 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = chars.length() - 1; i >= 0; i--)
            if (map.containsKey(chars.charAt(i)))
                map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
            else
                map.put(chars.charAt(i), 1);

        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int j = 0; j < word.length(); j++)
                if (temp.containsKey(word.charAt(j)))
                    temp.put(word.charAt(j), temp.get(word.charAt(j)) + 1);
                else
                    temp.put(word.charAt(j), 1);

            boolean boo = true;
            for (char key : temp.keySet())
                if (!map.containsKey(key) || map.get(key) < temp.get(key)) {
                    boo = false;
                    break;
                }
            if (boo) count += word.length();
        }

        return count;
    }
}
