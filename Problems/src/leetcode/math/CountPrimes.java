/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.math;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        int primeCount = 1;
        for (int i = 3; i < n; i += 2)
            if (isPrime(i)) primeCount++;
        return primeCount;
    }

    private boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i < num / 2; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
