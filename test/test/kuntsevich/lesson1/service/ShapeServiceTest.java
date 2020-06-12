package test.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.exception.IncorrectDataException;
import com.kuntsevich.lesson1.service.ShapeService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeServiceTest {

    private ShapeService shapeService = new ShapeService();

    @Test
    public void testSquareAreaSizeInCircleInSquarePositive() {
        double actual = 0;
        try {
            actual = shapeService.squareAreaSizeInCircleInSquare(100);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        double expected = 50d;
        assertEquals(actual, expected, 0.001);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testSquareAreaSizeInCircleInSquareException() throws IncorrectDataException {
        shapeService.squareAreaSizeInCircleInSquare(-1);
    }

    @Test
    public void testInnerSquareAreaSizeCoefficientPositive() {
        double actual = 0;
        try {
            actual = shapeService.innerSquareAreaSizeCoefficient(100);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        double expected = 2d;
        assertEquals(actual, expected, 0.001);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testInnerSquareAreaSizeCoefficientException() throws IncorrectDataException {
        shapeService.innerSquareAreaSizeCoefficient(-1);
    }

    @Test
    public void testCompareVectorLength() {
        int actual = shapeService.compareVectorLength(2, 2, 1, 1);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testCalcCircumferencePositive() {
        double actual = 0;
        try {
            actual = shapeService.calcCircumference(1);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        double expected = 2*Math.PI;
        assertEquals(actual, expected, 0.0001f);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCalcCircumferenceException() throws IncorrectDataException {
        shapeService.calcCircumference(-1);
    }

    @Test
    public void testCalcAreaSizePositive() {
        double actual = 0;
        try {
            actual = shapeService.calcAreaSize(1);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        double expected = Math.PI*Math.pow(1, 2);
        assertEquals(actual, expected, 0.001);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCalcAreaSizeException() throws IncorrectDataException {
        shapeService.calcAreaSize(-1);
    }
}