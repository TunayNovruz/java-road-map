/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int len1 = S.length();
        int len2 = T.length();
        int max = len1 > len2 ? len1 : len2;

        for (int i = 0; i < max; i++) {
            if (i < len1) {
                char temp = S.charAt(i);
                if (temp == '#') s1.pop();
                else s1.push(temp);
            }
            if (i < len2) {
                char temp = T.charAt(i);
                if (temp == '#') s2.pop();
                else s2.push(temp);
            }
        }
        return s1.equals(s2);
    }
}
