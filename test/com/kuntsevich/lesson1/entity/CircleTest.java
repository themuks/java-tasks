package com.kuntsevich.lesson1.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleTest {

    private Circle circle = new Circle(1);

    @Test
    public void testCalcCircumference() {
        double actual = circle.calcCircumference();
        double expected = 2*Math.PI*circle.getRadius();
        assertEquals(actual, expected, 0.0001f);
    }

    @Test
    public void testCalcAreaSize() {
        double actual = circle.calcAreaSize();
        double expected = Math.PI*Math.pow(circle.getRadius(), 2);
        assertEquals(actual, expected, 0.0001f);
    }
}