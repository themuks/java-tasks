package test.kuntsevich.lesson1.validator;

import com.kuntsevich.lesson1.validator.FunctionValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionValidatorTest {

    private FunctionValidator functionValidator = new FunctionValidator();

    @Test
    public void testValidateFunctionBoundsPositive() {
        assertTrue(functionValidator.validateFunctionBounds(0, 1, 0.1));
    }

    @Test
    public void testValidateFunctionBoundsNegative() {
        assertFalse(functionValidator.validateFunctionBounds(1, 0, 0.2));
    }
}