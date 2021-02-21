/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1;
        while (left <= n) {
            int mid = left + (n - left) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == 1) left = mid + 1;
            else n = mid - 1;
        }
        return 0;
    }

    public int guess(int n) {
        return 1;
    }
}
