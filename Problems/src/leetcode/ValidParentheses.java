/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {

        if (s.length() < 2)
            return false;
        char first = s.charAt(0);
        if (first == ')' || first == '}' || first == ']')
            return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[')
                stack.push(temp);
            else {
                if (stack.size() == 0)
                    return false;
                char last = stack.pop();
                if (last == '(' && temp != ')')
                    return false;
                else if (last == '{' && temp != '}')
                    return false;
                else if (last == '[' && temp != ']')
                    return false;
            }
        }

        return stack.size() == 0;
    }


}
