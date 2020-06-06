package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.entity.Function;
import com.kuntsevich.lesson1.entity.TangentFunction;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    private NumberService numberService = new NumberService();

    @Test()
    public void testLastDigitOfNumber() {
        int actual = numberService.lastDigitOfNumber(11);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testLastDigitOfSquaredNumber() {
        int actual = numberService.lastDigitOfSquaredNumber(98);
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsTwoEvenExist() {
        int[] ints = new int[] {1, 2, 3, 4};
        boolean actual = numberService.isTwoEvenExist(ints);
        assertTrue(actual);
    }

    @Test
    public void testIsPerfect() {
        boolean actual = numberService.isPerfect(6);
        assertTrue(actual);
    }

    @Test
    public void testGetFunctionValuesInRange() {
        Function function = new TangentFunction();
        double[] actual = numberService.getFunctionValuesInRange(function, 0, 1, 0.5f);
        double[] expected = new double[] {function.getValue(0), function.getValue(0.5f), function.getValue(1)};
        assertEquals(actual, expected);
    }
}