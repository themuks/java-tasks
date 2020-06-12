package test.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.entity.CustomFunction;
import com.kuntsevich.lesson1.entity.TangentCustomFunction;
import com.kuntsevich.lesson1.exception.IncorrectDataException;
import com.kuntsevich.lesson1.service.NumberService;
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
    public void testIsTwoEvenExistPositive() {
        int[] ints = new int[] {1, 2, 3, 4};
        boolean actual = numberService.isTwoEvenExist(ints);
        assertTrue(actual);
    }

    @Test
    public void testIsTwoEvenExistNegative() {
        int[] ints = new int[] {1, 3, 5, 7};
        boolean actual = numberService.isTwoEvenExist(ints);
        assertFalse(actual);
    }

    @Test
    public void testIsPerfectPositive() {
        boolean actual = numberService.isPerfect(6);
        assertTrue(actual);
    }

    @Test
    public void testIsPerfectNegative() {
        boolean actual = numberService.isPerfect(10);
        assertFalse(actual);
    }

    @Test
    public void testCalcFunctionValuesPositive() {
        CustomFunction customFunction = new TangentCustomFunction();
        double[] actual = new double[0];
        try {
            actual = numberService.calcFunctionValues(customFunction, 0, 1, 0.5);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        double[] expected = new double[] {customFunction.calcValue(0), customFunction.calcValue(0.5), customFunction.calcValue(1)};
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCalcFunctionValuesException() throws IncorrectDataException {
        CustomFunction customFunction = new TangentCustomFunction();
        numberService.calcFunctionValues(customFunction, 1, 0, 0.1);
    }
}