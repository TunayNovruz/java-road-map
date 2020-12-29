/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> result = generateParenthesis(3);
        for (String res : result)
            System.out.println(res);
    }

    public static void find(int n, int openCount, int closeCount, String str, List<String> list) {
        if (openCount < n) {
            find(n, openCount + 1, closeCount, str + "(", list);
        }

        if (closeCount < openCount) {
            find(n, openCount, closeCount + 1, str + ")", list);
        }

        if (openCount == n && closeCount == n)
            list.add(str);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        find(n, 0, 0, "", list);
        return list;
    }
}
