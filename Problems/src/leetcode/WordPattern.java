/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if (words.length != pattern.length())
            return false;
        HashMap<String, Character> map = new HashMap<>();
        HashSet<Character> checked = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            char temp = pattern.charAt(i);
            if (map.get(words[i]) != null && !map.get(words[i]).equals(temp)) {
                return false;
            }

            if (map.get(words[i]) == null && checked.contains(temp)) {
                return false;
            }

            map.put(words[i], temp);
            checked.add(temp);
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if (t.length() != s.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> checked = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            char temp = s.charAt(i);
            if (map.get(t.charAt(i)) != null && !map.get(t.charAt(i)).equals(temp)) {
                return false;
            }

            if (map.get(t.charAt(i)) == null && checked.contains(temp)) {
                return false;
            }

            map.put(t.charAt(i), temp);
            checked.add(temp);
        }
        return true;
    }

}
