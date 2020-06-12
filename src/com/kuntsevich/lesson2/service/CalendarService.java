package com.kuntsevich.lesson2.service;

import com.kuntsevich.lesson2.exception.IncorrectDataException;
import com.kuntsevich.lesson2.parser.DataParser;
import com.kuntsevich.lesson2.validator.CalendarValidator;

import java.util.Calendar;

public class CalendarService {

    public String birthdayInfo(int day, int month, int year) throws IncorrectDataException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (!calendarValidator.validateBirthDay(day, month, year)) {
            throw new IncorrectDataException("Incorrect date");
        }
        Calendar calendar = Calendar.getInstance();
        int age = calendar.get(Calendar.YEAR) - year;
        boolean isBirthday = false;
        if (day == calendar.get(Calendar.DAY_OF_MONTH) && month - 1 == calendar.get(Calendar.MONTH)) {
            isBirthday = true;
        }
        calendar.set(year, month, day);
        String result;
        if (isBirthday) {
            result = String.format("Day of week - %tA; Age - %d; Happy birthday!", calendar.getTime(), age);
        } else {
            result = String.format("Day of week - %tA; Age - %d", calendar.getTime(), age);
        }
        return result;
    }

    public String deadlineInfo(String surname, int dayCount) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, dayCount);
        return String.format("Surname - %s, finish date - %2$td.%2$tm.%2$ty %2tT%n", surname, calendar.getTime());
    }
}
