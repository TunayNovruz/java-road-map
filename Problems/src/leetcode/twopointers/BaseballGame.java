/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

public class BaseballGame {
    public int calPoints(String[] ops) {
        int p1 = 0, p2 = 0, p3 = 0;
        int sum = 0;

        for (String op : ops) {
            switch (op) {
                case "C":
                    sum = sum - p3;
                    p3 = p2;
                    p2 = p1;
                    p1 = 0;
                    break;
                case "D":
                    p1 = p2;
                    p2 = p3;
                    p3 = p1 * p2;
                    sum += p3;
                    break;
                case "+":
                    p1 = p2;
                    p2 = p3;
                    p3 = p1 + p2;
                    sum += p3;
                    break;
                default:
                    p1 = p2;
                    p2 = p3;
                    p3 = Integer.parseInt(op);
                    sum += p3;

            }

        }
        return sum;
    }
}
