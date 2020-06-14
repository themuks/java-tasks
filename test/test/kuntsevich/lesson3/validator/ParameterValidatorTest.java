package test.kuntsevich.lesson3.validator;

import com.kuntsevich.lesson3.validator.ParameterValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParameterValidatorTest {

    private ParameterValidator parameterValidator = new ParameterValidator();

    @Test
    public void testValidateWeightPositive() {
        assertTrue(parameterValidator.validateWeight(10));
    }

    @Test
    public void testValidateWeightNegative() {
        assertFalse(parameterValidator.validateWeight(-1));
    }

    @Test
    public void testValidateMaxCountPositive() {
        assertTrue(parameterValidator.validateMaxCount(100));
    }

    @Test
    public void testValidateMaxCountNegative() {
        assertFalse(parameterValidator.validateMaxCount(-1));
    }

    @Test
    public void testValidateMaxWeightPositive() {
        assertTrue(parameterValidator.validateMaxWeight(20));
    }

    @Test
    public void testValidateMaxWeightNegative() {
        assertFalse(parameterValidator.validateMaxWeight(-1));
    }
}