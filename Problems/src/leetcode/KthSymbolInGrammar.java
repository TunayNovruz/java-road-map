/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KthSymbolInGrammar {

    public static void main(String[] args) {
        System.out.println(kthGrammar(5, 12));
    }

    public static int find(int pos, int n, int k, List<Integer> digits) {
        System.out.println(digits);
        ArrayList<Integer> temp = new ArrayList<>();
        int size = digits.size();
        for (int i = size / 2; i < size; i++) {
            if (i == k)
                return digits.get(i);

            if (digits.get(i) == 0) {
                temp.add(0);
                temp.add(1);
            } else {
                temp.add(1);
                temp.add(0);
            }
        }
        digits = temp;
        if (pos == n) {
            return temp.get(k - size);
        }
        return find(pos + 1, n, k - size, digits);
    }

    public static int kthGrammar(int N, int K) {
        if (N == 1 || K == 1)
            return 0;

        for (int i = 1; i < N; i++) {
            if (K <= Math.pow(2, i)) {
                N = i;
                break;
            }
        }

        return secondWay(N, K, 0, K);
    }


    public static int secondWay(int n, int k, int num, int K) {
        System.out.println("num:" + num);
        System.out.println("n:" + n);
        System.out.println("k:" + k);
        System.out.println("===");


        if (n == 1) {
            if (num == 0 && K % 2 == 1)
                return 0;
            else if (num == 0 && k % 2 == 0)
                return 1;
            else if (num == 1 && k % 2 == 1)
                return 1;
            else if (num == 1 && k % 2 == 0)
                return 0;
        }

//        if (K % 2 == 0 && k % 2 == 1)
//            k--;
//        if (K % 2 == 1 && k % 2 == 1)
//            k++;

        if (num == 0) {
            if (Math.pow(2, n - 1) <= k) {
                return secondWay(n - 1, k - (int) Math.pow(2, n - 1), 1, K);
            } else {
                return secondWay(n - 1, k, 0, K);
            }
        } else {
            if (Math.pow(2, n - 1) <= k) {
                return secondWay(n - 1, k - (int) Math.pow(2, n - 1), 0, K);
            } else {
                return secondWay(n - 1, k, 1, K);
            }
        }
    }
}
