package com.kuntsevich.lesson1.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentFunctionTest {

    private Function function = new TangentFunction();

    @Test
    public void testGetValue() {
        double actual = function.getValue(2);
        double expected = Math.tan(2);
        assertEquals(actual, expected, 0.0001f);
    }
}