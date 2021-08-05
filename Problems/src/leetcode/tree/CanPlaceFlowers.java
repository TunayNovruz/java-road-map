/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.tree;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) return n == 1 && flowerbed[0] == 0;
        if (flowerbed.length == 2) return n == 1 && flowerbed[0] == 0 && flowerbed[1] == 0;
        int count = 0;
        int i = 1;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            count++;
            flowerbed[0] = 1;
        }
        while (i < flowerbed.length - 1) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count++;
                if (n <= count) return true;
            }
            i++;
        }

        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            count++;
        }
        return n <= count;
    }
}
