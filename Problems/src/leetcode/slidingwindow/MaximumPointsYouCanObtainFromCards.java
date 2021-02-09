/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumPointsYouCanObtainFromCards {
    public static int sum = 0;
    public static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 2, 3, 4, 5};
        int res = maxScore(nums, 2);
        System.out.println("res: " + res);
    }

    public static int maxScore(int[] cards, int k) {
        find(0, cards.length - 1, 0, k, cards);
        return sum;
    }

    public static void find(int left, int right, int total, int k, int[] nums) {
        System.out.println("left: " + left);
        System.out.println("ri: " + right);
        sum = Math.max(sum, total);
        if (k == 0) return;
        if (!set.contains(right - 1)) {
            set.add(right - 1);
            find(left, right - 1, total + nums[right], k - 1, nums);
            set.remove(right - 1);
        }
        if (!set.contains(left + 1)) {
            set.add(left + 1);
            find(left + 1, right, total + nums[left], k - 1, nums);
            set.remove(left + 1);
        }
    }
}
