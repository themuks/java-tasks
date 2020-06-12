package test.kuntsevich.lesson1.validator;

import com.kuntsevich.lesson1.validator.CalendarValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarValidatorTest {

    private CalendarValidator calendarValidator = new CalendarValidator();

    @Test
    public void testValidateMonthPositive() {
        assertTrue(calendarValidator.validateMonth(11));
    }

    @Test
    public void testValidateMonthNegative() {
        assertFalse(calendarValidator.validateMonth(0));
    }

    @Test
    public void testValidateYearPositive() {
        assertTrue(calendarValidator.validateYear(2100));
    }

    @Test
    public void testValidateYearNegative() {
        assertFalse(calendarValidator.validateYear(9999));
    }

    @Test
    public void testValidateSecondsPositive() {
        assertTrue(calendarValidator.validateSeconds(3600));
    }

    @Test
    public void testValidateSecondsNegative() {
        assertFalse(calendarValidator.validateSeconds(-1));
    }
}