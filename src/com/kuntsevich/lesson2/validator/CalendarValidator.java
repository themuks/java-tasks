package com.kuntsevich.lesson2.validator;

import com.kuntsevich.lesson2.entity.CustomMonth;

public class CalendarValidator {

    private final int MONTH_RANGE_LEFT_BOUND = 1;
    private final int MONTH_RANGE_RIGHT_BOUND = 12;
    private final int YEAR_RANGE_LEFT_BOUND = 0;
    private final int YEAR_RANGE_RIGHT_BOUND = 3000;

    public boolean validateMonth(int month) {
        return MONTH_RANGE_LEFT_BOUND <= month && month <= MONTH_RANGE_RIGHT_BOUND;
    }

    public boolean validateYear(int year) {
        return YEAR_RANGE_LEFT_BOUND <= year && year <= YEAR_RANGE_RIGHT_BOUND;
    }

    public boolean validateDay(int day, int month) {
        return 0 < day && day <= CustomMonth.values()[month-1].getDaysCount();
    }

    public boolean validateBirthDay(int day, int month, int year) {
        return validateDay(day, month) && validateMonth(month) && validateYear(year);
    }
}
