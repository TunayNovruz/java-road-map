/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("^[A-Za-z]", "").toLowerCase();
        System.out.println(s);
        int end = s.length();
        for (int i = 0; i < end / 2; i++) {
            if (s.charAt(i) != s.charAt(end - 1 - i))
                return false;
        }
        return true;
    }
}