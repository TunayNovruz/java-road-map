/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.HashMap;

public class JumpGameIII {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 3, 0, 3, 1, 2};
        int start = 0;

        System.out.println(canReach(nums, start));
    }

    public static boolean canReach(int[] arr, int start) {

        var checked = new HashMap<Integer, Boolean>();
        return check(arr, start, checked);
    }

    public static boolean check(int[] nums, int index, HashMap<Integer, Boolean> checked) {
        if (index >= nums.length || index < 0)
            return false;

        if (nums[index] == 0)
            return true;
        if (checked.size() == nums.length)
            return false;

        if (checked.get(index) != null)
            return false;

        checked.put(index, true);

        boolean plusCheck = false;
        if (index + nums[index] <= nums.length)
            plusCheck = check(nums, index + nums[index], checked);

        if (plusCheck)
            return plusCheck;

        boolean minusCheck = false;
        if (index - nums[index] > -1)
            minusCheck = check(nums, index - nums[index], checked);

        return minusCheck;
    }
}
