package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.exception.IncorrectDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {

    private CalendarService calendarService = new CalendarService();

    @Test
    public void testMonthDayCount() throws IncorrectDataException {
        int actual = calendarService.monthDayCount(2020, 2);
        int expected = 29;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsYearLeap() {
        assertTrue(calendarService.isLeapYear(1600));
    }

    @Test
    public void testCalcHoursPassed() throws IncorrectDataException {
        int actual = calendarService.calcHoursPassed(3600);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testCalcMinutesPassed() throws IncorrectDataException {
        int actual = calendarService.calcMinutesPassed(120);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void testTimePassed() throws IncorrectDataException {
        String actual = calendarService.timePassed(3661);
        String expected = "1:1:1";
        assertEquals(actual, expected);
    }
}