package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    void testAreaForBaseTenHeightFive() {
        assertEquals(25.0,
                TriangleArea.calculateArea(10, 5), 0.001);
    }

    @Test
    void testAreaForBaseFourHeightFive() {
        assertEquals(10.0,
                TriangleArea.calculateArea(4, 5), 0.001);
    }

    @Test
    void testAreaForBaseSixHeightThree() {
        assertEquals(9.0,
                TriangleArea.calculateArea(6, 3), 0.001);
    }

    @Test
    void testNegativeBase() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleArea.calculateArea(-5, 4));
    }
}