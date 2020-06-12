package test.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.exception.IncorrectDataException;
import com.kuntsevich.lesson1.service.CalendarService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {

    private CalendarService calendarService = new CalendarService();

    @Test
    public void testMonthDayCountPositive() {
        int actual = 0;
        try {
            actual = calendarService.monthDayCount(2020, 2);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        int expected = 29;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testMonthDayCountYearException() throws IncorrectDataException {
        calendarService.monthDayCount(-1, 2);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testMonthDayCountMonthException() throws IncorrectDataException {
        calendarService.monthDayCount(2000, -1);
    }

    @Test
    public void testIsYearLeapPositive() {
        assertTrue(calendarService.isLeapYear(1600));
    }

    @Test
    public void testIsYearLeapNegative() {
        assertFalse(calendarService.isLeapYear(1999));
    }

    @Test
    public void testCalcHoursPassedPositive() {
        int actual = 0;
        try {
            actual = calendarService.calcHoursPassed(3600);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCalcHoursPassedException() throws IncorrectDataException {
         calendarService.calcHoursPassed(-1);
    }

    @Test
    public void testCalcMinutesPassedPositive() {
        int actual = 0;
        try {
            actual = calendarService.calcMinutesPassed(120);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testCalcMinutesPassedException() throws IncorrectDataException {
         calendarService.calcMinutesPassed(-1);
    }

    @Test
    public void testTimePassedPositive() {
        String actual = null;
        try {
            actual = calendarService.timePassed(3661);
        } catch (IncorrectDataException e) {
            fail("Exception was thrown");
        }
        String expected = "1:1:1";
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectDataException.class)
    public void testTimePassedException() throws IncorrectDataException {
         calendarService.timePassed(-1);
    }
}