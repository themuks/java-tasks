package com.kuntsevich.lesson1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeValidatorTest {

    private ShapeValidator shapeValidator = new ShapeValidator();

    @Test
    public void testValidateAreaSize() {
        assertTrue(shapeValidator.validateAreaSize(123.123d));
    }
}