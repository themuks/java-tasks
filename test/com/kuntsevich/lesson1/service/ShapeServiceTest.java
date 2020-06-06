package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.exception.IncorrectDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeServiceTest {

    private ShapeService shapeService = new ShapeService();

    @Test
    public void testSquareAreaSizeInCircleInSquare() throws IncorrectDataException {
        double actual = shapeService.squareAreaSizeInCircleInSquare(100);
        double expected = 50d;
        assertEquals(actual, expected, 0.0001f);
    }

    @Test
    public void testInnerSquareAreaSizeCoefficient() throws IncorrectDataException {
        double actual = shapeService.innerSquareAreaSizeCoefficient(100);
        double expected = 2d;
        assertEquals(actual, expected, 0.0001f);
    }

    @Test
    public void testCompareVectorLength() {
        int actual = shapeService.compareVectorLength(2, 2, 1, 1);
        int expected = 1;
        assertEquals(actual, expected);
    }
}