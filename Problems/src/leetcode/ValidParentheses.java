/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.ArrayList;

public class ValidParentheses {


    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            list.add(temp);

        }
        return true;
    }


}
