/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        System.out.println(coinChange(coins, amount));
    }


    public static int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> map = new HashMap<>();
        return find(amount, coins, 0, map);
    }

    public static int find(int amount, int[] coins, int count, Map<Integer, Integer> map) {
        if (map.get(amount) != null) {
            return map.get(amount);
        }
        if (amount == 0)
            return count;
        if (amount < 0)
            return -1;
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = find(amount - coin, coins, count + 1, map);
            if (result > 0) {
                min = Math.min(result, min);
            }
        }
        min = (min == Integer.MAX_VALUE ? -1 : min);
        map.put(amount, min);
        return min;

    }
}
