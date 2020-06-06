package com.kuntsevich.lesson1.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomFunctionTest {

    private Function function = new CustomFunction();

    @Test
    public void testGetValue() {
        double actual = function.getValue(2);
        double expected = 0.5d;
        assertEquals(actual, expected, 0.0001f);
    }
}