/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

//todo unsolved
// leetcode cavabi qebul etmedi
public class LongestSubstringwithAtLeastKRepeatingCharacters {
    public static HashMap<Character, Integer> charCount = new HashMap<>();
    public static HashMap<Character, Boolean> allowed = new HashMap<>();
    public static String maxSubstring = "";

    public static void main(String[] arguments) {
        System.out.println(longestSubstring("weitong", 2));
    }

    public static int longestSubstring(String s, int k) {

        if (k == 1)
            return s.length();

        for (int i = 0; i < s.length(); i++)
            charCount.merge(s.charAt(i), 1, Integer::sum);

        for (Map.Entry<Character, Integer> me : charCount.entrySet())
            if (me.getValue() >= k)
                allowed.put(me.getKey(), true);
        if (allowed.size() == 0)
            return 0;
        for (int i = 0; i < s.length() - k + 1; i++)
            find("", s, i);
        return maxSubstring.length();
    }

    public static void find(String parent, String s, int x) {
        if (parent.length() > maxSubstring.length())
            maxSubstring = parent;
        if (x >= s.length()) return;
        if (allowed.get(s.charAt(x)) != null)
            find(parent + s.charAt(x), s, x + 1);
    }

}
