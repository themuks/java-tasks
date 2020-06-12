package com.kuntsevich.lesson1.validator;

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

    public boolean validateSeconds(int seconds) {
        return 0 <= seconds;
    }
}
