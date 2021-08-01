/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.hash;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {

        if (n == 1) return true;
        Set<Integer> map = new HashSet<>();
        int sum = 0;
        while (n > 0) {
            int mod = n % 10;
            sum += mod * mod;
            n = n / 10;
            if (n == 0) {
                if (sum == 1) return true;
                if (map.contains(sum)) return false;
                map.add(sum);
                n = sum;
                sum = 0;
            }
        }
        return false;
    }
}
