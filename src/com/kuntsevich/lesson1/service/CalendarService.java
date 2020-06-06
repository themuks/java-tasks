package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.exception.IncorrectDataException;
import com.kuntsevich.lesson1.entity.Month;
import com.kuntsevich.lesson1.validator.CalendarValidator;

public class CalendarService {

    private final int SECONDS_IN_MINUTE = 60;
    private final int SECONDS_IN_HOUR = 60*SECONDS_IN_MINUTE;

    public int monthDayCount(int year, int monthIndex) throws IncorrectDataException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (!calendarValidator.validateYear(year)) {
            throw new IncorrectDataException("Year is out of range.");
        }
        if (!calendarValidator.validateMonth(monthIndex)) {
            throw new IncorrectDataException("Month is out of range.");
        }
        Month month = Month.values()[monthIndex - 1];
        if (isLeapYear(year) && month == Month.FEBRUARY) {
            return month.getDaysCount() + 1;
        }
        return month.getDaysCount();
    }

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else
            return year % 4 == 0;
    }

    public int calcHoursPassed(int seconds) throws IncorrectDataException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (!calendarValidator.validateSeconds(seconds)) {
            throw new IncorrectDataException("Seconds is out of range.");
        }
        return seconds/SECONDS_IN_HOUR;
    }

    public int calcMinutesPassed(int seconds) throws IncorrectDataException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (!calendarValidator.validateSeconds(seconds)) {
            throw new IncorrectDataException("Seconds is out of range.");
        }
        return seconds/SECONDS_IN_MINUTE;
    }

    public String timePassed(int seconds) throws IncorrectDataException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (!calendarValidator.validateSeconds(seconds)) {
            throw new IncorrectDataException("Seconds is out of range.");
        }
        StringBuilder sb = new StringBuilder();
        int hours = calcHoursPassed(seconds);
        seconds %= SECONDS_IN_HOUR;
        int minutes = calcMinutesPassed(seconds);
        seconds %= SECONDS_IN_MINUTE;
        sb.append(hours).append(":").append(minutes).append(":").append(seconds);
        return sb.toString();
    }
}
