/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int l = 0;
        int r = needle.length() - 1;
        if (r < 0) return 0;
        int len = haystack.length();
        if (len < r) return -1;
        StringBuilder bs = new StringBuilder();
        while (l <= r)
            bs.append(haystack.charAt(l++));

        if (bs.toString().equals(needle)) return 0;
        l = 1;
        StringBuilder needleBs = new StringBuilder(needle);
        while (r < len) {
            bs.deleteCharAt(0);
            bs.append(haystack.charAt(r++));
            if (bs.compareTo(needleBs) == 0) return l;
            l++;
        }
        return -1;
    }
}
