package com.example.springbootudemy.validate_testcase;

import java.util.Arrays;

/**
 * @author DuyND
 * @name ArrayUtils.java
 * @date 08/10/2023
 */
public class ArrayUtils {

    public static int findNthLargest(int[] nums, int n) {
        if (n < 1 || n > nums.length) {
            throw new IllegalArgumentException("Invalid value of n");
        }
        Arrays.sort(nums);
        return nums[nums.length - n];
    }
}
