/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //two pointers

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (Math.min(height[left], height[right]) * right - left));
            if (height[left] > height[right])
                right--;
            else left++;
        }

        return maxArea;


        //brute force
        /*int maxArea = 0;
        if (height.length == 2) return Math.min(height[0], height[1]);
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, temp);
            }
        }
        return maxArea;*/
    }

}
