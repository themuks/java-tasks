package com.kuntsevich.lesson1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {

    private NumberValidator numberValidator = new NumberValidator();

    @Test
    public void testValidateIntegerNumberInRange() {
        assertTrue(numberValidator.validateIntegerNumberInRange(50));
    }

    @Test
    public void testValidateDoubleNumberInRange() {
        assertTrue(numberValidator.validateDoubleNumberInRange(-50.1d));
    }
}