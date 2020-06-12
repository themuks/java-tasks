package test.kuntsevich.lesson1.validator;

import com.kuntsevich.lesson1.validator.NumberValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {

    private NumberValidator numberValidator = new NumberValidator();

    @Test
    public void testValidateIntegerNumberPositive() {
        assertTrue(numberValidator.validateIntegerNumber(50));
    }

    @Test
    public void testValidateIntegerNumberNegative() {
        assertFalse(numberValidator.validateIntegerNumber(9999));
    }

    @Test
    public void testValidateDoubleNumberPositive() {
        assertTrue(numberValidator.validateDoubleNumber(-50.1));
    }

    @Test
    public void testValidateDoubleNumberNegative() {
        assertFalse(numberValidator.validateDoubleNumber(9999));
    }
}