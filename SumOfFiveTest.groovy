package com.company

import junit.framework.TestCase
import org.junit.Test

class SumOfFiveTest extends TestCase {
    // white-box
    @Test
    void testIsEvenPositive() {
        boolean result = new SumOfFive().isEven(10);
        assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        boolean result = (new SumOfFive()).isEven(11);
        assertFalse(result);
    }


    @Test
    void testSumOfEven() {
        int [] numbers = {1, 2, 3, 4, 5};
        int result = (int) (new SumOfFive()).sumOfEven(numbers);
        assertEquals(result, 6);
    }
}