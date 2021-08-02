/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.string;

public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = words[i].length(); j >= 0; j--)
                temp.append(words[i].charAt(j));
            words[i] = temp.toString();
        }

        return String.join(" ", words);
    }
}
