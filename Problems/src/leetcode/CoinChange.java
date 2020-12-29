/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {5, 12};
        Arrays.sort(coins);
        int index = coins.length - 1;
        System.out.println(find(coins, 25, index, 0));
        // coins  4  amount: 11

    }

    public static int find(int[] coins, int amount, int pos, int count) {

        if (amount == 0)
            return count;

        if (amount < 0 || pos < 0)
            return -1;

        int max = coins[pos];

        if (max > amount)
            return find(coins, amount, pos - 1, count);

        return find(coins, amount - max, pos, count + 1);
    }

    public static void coinChange() {

    }
}
