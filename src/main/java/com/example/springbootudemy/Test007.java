package com.example.springbootudemy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author DuyND
 * @name Test007.java
 * @date 13/10/2023
 */
public class Test007 {
    public static int findNthLargest(int[] nums, int n) {
        if (n < 1 || n > nums.length) {
            throw new IllegalArgumentException("Invalid value of n");
        }
        Arrays.sort(nums);
        return nums[nums.length - n];
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 7, 7, 8, 8, 12, 12, 14, 15, 15, 17, 17, 17, 18, 19, 19, 20, 21, 23,
                23, 26, 26, 27, 28, 29, 30, 31, 31, 32, 32, 32, 33, 34, 36, 36, 38, 39, 40, 40,
                41, 41, 42, 44, 45, 45, 46, 49, 50, 51, 52, 52, 52, 54, 55, 56, 56, 56, 57, 57, 57, 59, 60, 61, 62, 63, 63, 64, 68, 68, 70, 70, 71, 71, 76, 76, 77, 77, 81, 82, 85, 85, 85, 88, 88, 90, 90, 91, 92, 93, 94, 95, 95, 96, 98, 99, 99, 99, 100, 100};

        System.out.println(array.length);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set.size());
        System.out.println(findNthLargest(array, 84));
    }
}
