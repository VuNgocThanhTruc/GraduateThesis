package com.example.springbootudemy;

import org.junit.jupiter.api.Test;
import org.quicktheories.QuickTheory;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.quicktheories.generators.SourceDSL.integers;
import static org.quicktheories.generators.SourceDSL.lists;

/**
 * @author DuyND
 * @name ArrayUtilsTest2.java
 * @date 08/10/2023
 */
class TestArrayUtilsVersionTwo {

    @Test
    void testFindNthLargest() {
        AtomicInteger occurrences = new AtomicInteger();
        QuickTheory.qt()
                .forAll(integers().between(1, 100),
                        lists().of(integers().between(1, 100)).ofSizeBetween(1, 100))
                .check((n, arr) -> {
                    if (n <= 0 || n > arr.size()) {
                        return true; // Không kiểm tra nếu n không hợp lệ
                    }

                    int expectedNthLargest = findNthLargest(arr, n);
                    arr.sort(null); // Sắp xếp danh sách
                    int actualNthLargest = arr.get(arr.size() - n);
                    assertEquals(expectedNthLargest, actualNthLargest);

                    // In danh sách ngẫu nhiên mỗi khi được tạo
                    System.out.println("stt: " + occurrences + " ,Random List: " + arr + " So lon " +
                            " thu " + n + " la: " + actualNthLargest);

                    occurrences.getAndIncrement();

                    return true;
                });
        System.out.println("Occurrences: " + occurrences); // In số lần xuất hiện của danh sách ngẫu nhiên
    }

    static int findNthLargest(List<Integer> nums, int n) {
        if (n < 1 || n > nums.size()) {
            throw new IllegalArgumentException("Invalid value of n");
        }
        nums.sort(null);
        return nums.get(nums.size() - n);
    }
}
