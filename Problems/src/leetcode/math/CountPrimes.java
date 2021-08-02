/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.math;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        int[] nonPrimes = new int[n];
        for (int i = 2; i < n; i++)
            for (int j = 2 * i; j < n && nonPrimes[j] == 0; j += i) {
                nonPrimes[j] = 1;
            }

        int primeCount = 0;
        for (int i = 2; i < n; i++)
            if (nonPrimes[i] == 0) primeCount++;
        return primeCount;
    }

    private boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i < num / 2; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
