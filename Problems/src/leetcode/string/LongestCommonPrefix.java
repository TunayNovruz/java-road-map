/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0 || sb.length() == 0) return "";
            for (int j = 0; j < sb.length(); j++)
                if (j >= strs[i].length() || strs[i].charAt(j) != sb.charAt(j)) {
                    sb.delete(j, sb.length());
                    break;
                }
        }
        return sb.toString();
    }
}
