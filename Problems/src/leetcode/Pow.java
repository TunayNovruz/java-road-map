/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class Pow {

    public static void main(String[] args) {
        System.out.println("netice: " + myPow(-3, 124));
    }

    public static double myPow(double x, int n) {
        if (x == 0)
            return 0;
        if (n == 0 || x == 1 || (x == -1 && n % 2 == 0))
            return 1;
        if (x == -1)
            return -1;
        if (n < 0)
            return find(1 / x, x, n);
        return find(x, x, n);

    }


    public static double find(double result, double x, int n) {
        if (n == 1 || n == -1)
            return result;
        if (result < 0.00001 && result >= 0 || result > -0.00001 && result <= 0)
            return 0;
        if (n < 0)
            return find(result / x, x, n + 1);
        return find(result * x, x, n - 1);
    }
}
