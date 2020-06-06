package com.kuntsevich.lesson1.validator;

public class NumberValidator {

    private final int VALUE_RANGE_LEFT_BORDER = -1000;
    private final int VALUE_RANGE_RIGHT_BORDER = 1000;

    public boolean validateIntegerNumberInRange(int num) {
        return VALUE_RANGE_LEFT_BORDER <= num && num <= VALUE_RANGE_RIGHT_BORDER;
    }

    public boolean validateDoubleNumberInRange(double num) {
        return VALUE_RANGE_LEFT_BORDER <= num && num <= VALUE_RANGE_RIGHT_BORDER;
    }
}
