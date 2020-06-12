package test.kuntsevich.lesson1.validator;

import com.kuntsevich.lesson1.validator.ShapeValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeValidatorTest {

    private ShapeValidator shapeValidator = new ShapeValidator();

    @Test
    public void testValidateAreaSizePositive() {
        assertTrue(shapeValidator.validateAreaSize(123.123));
    }

    @Test
    public void testValidateAreaSizeNegative() {
        assertFalse(shapeValidator.validateAreaSize(-1));
    }

    @Test
    public void testValidateRadiusPositive() {
        assertTrue(shapeValidator.validateRadius(10));
    }

    @Test
    public void testValidateRadiusNegative() {
        assertFalse(shapeValidator.validateRadius(-1));
    }
}