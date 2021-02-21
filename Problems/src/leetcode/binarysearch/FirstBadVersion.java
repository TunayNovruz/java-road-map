/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.binarysearch;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int min = n + 1;
        while (left <= n) {
            int mid = left + (n - left) / 2;
            if (isBadVersion(mid)) {
                if (mid < min) min = mid;
                n = mid - 1;
            } else left = mid + 1;
        }

        return min;
    }

    public boolean isBadVersion(int n) {
        return true;
    }
}
