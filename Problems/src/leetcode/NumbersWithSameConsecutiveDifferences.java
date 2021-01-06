/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayList;

public class NumbersWithSameConsecutiveDifferences {


    public static void main(String[] args) {
        int[] res = numsSameConsecDiff(9, 1);
        for (int re : res) {
            System.out.println(re);
        }
    }

    public static void findNums(int n, int k, int currentNum, String str, ArrayList<String> result) {

        if (currentNum > 9 || currentNum < 0)
            return;
        if (n - 1 == 0) {
//            System.out.println(str + currentNum);
            result.add(str + currentNum);
            return;
        }
        findNums(n - 1, k, currentNum + k, str + currentNum, result);
        if (k != 0)
            findNums(n - 1, k, currentNum - k, str + currentNum, result);
    }

    public static int[] numsSameConsecDiff(int n, int k) {

        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (i + k < 10 || (i >= k && 10 - i <= k))
                findNums(n, k, i, "", result);
//            System.out.println();
        }
        int[] res = new int[result.size()];
        for (int j = 0; j < result.size(); j++)
            res[j] = Integer.parseInt(result.get(j));

        return res;
    }
}
