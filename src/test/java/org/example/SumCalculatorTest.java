package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumWithPositiveInput() {
        assertEquals(1, sumCalculator.sum(1));
        assertEquals(6, sumCalculator.sum(3));
        assertEquals(15, sumCalculator.sum(5));
        System.out.println("testSumWithPositiveInput passed");
    }

    @Test
    void testSumWithZeroInput() {
        assertEquals(0, sumCalculator.sum(0));
        System.out.println("testSumWithZeroInput passed");
    }

    @Test
    void testSumWithNegativeInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));
        assertEquals("Input should be a non-negative integer.", exception.getMessage());
        System.out.println("testSumWithNegativeInput passed for negative input");

        exception = assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(Integer.MIN_VALUE));
        assertEquals("Input should be a non-negative integer.", exception.getMessage());
        System.out.println("testSumWithNegativeInput passed for Integer.MIN_VALUE");
    }

    @AfterEach
    public void afterEach() {
        sumCalculator.clear();
        System.out.println("After Each executed");
    }
}