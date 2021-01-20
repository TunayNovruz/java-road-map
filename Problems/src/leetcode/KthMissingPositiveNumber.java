/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {

        int missingCount = 0;
        int index = 0;
        int num = 1;
        while (true) {

            if (arr[index] != num)
                missingCount++;
            else if (index < arr.length)
                index++;

            if (missingCount == k)
                return num;
            num++;
        }
    }

}
