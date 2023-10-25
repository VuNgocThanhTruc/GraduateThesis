package com.example.springbootudemy;

import com.example.springbootudemy.validate_testcase.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author DuyND
 * @name ArrayUtilsTest.java
 * @date 08/10/2023
 */
class ArrayUtilsTest {

    @Test
    void testFindNthLargest(){
        int[] array =  {5,9,3,1,7};

        assertEquals(7, ArrayUtils.findNthLargest(array, -1));

        assertEquals(3, ArrayUtils.findNthLargest(array, 4));
    }

    @Test
    public void testInvalidN(){
        int[] array = {1,2,3};

        // Kiểm tra khi n không hợp lệ (n <= 0)
//        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findNthLargest(array, 0));
//        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findNthLargest(array, -1));

        // Kiểm tra khi n lớn hơn kích thước của mảng
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findNthLargest(array, 100));
    }
}
