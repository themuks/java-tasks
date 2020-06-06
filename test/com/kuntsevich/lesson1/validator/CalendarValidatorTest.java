package com.kuntsevich.lesson1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarValidatorTest {

    private CalendarValidator calendarValidator = new CalendarValidator();

    @Test
    public void testValidateMonth() {
        assertTrue(calendarValidator.validateMonth(11));
    }

    @Test
    public void testValidateYear() {
        assertTrue(calendarValidator.validateYear(2100));
    }

    @Test
    public void testValidateSeconds() {
        assertTrue(calendarValidator.validateSeconds(3600));
    }
}