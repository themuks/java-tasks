package com.kuntsevich.lesson1.validator;

public class FunctionValidator {

    public boolean validateFunctionBounds(double start, double end, double step) {
        return (start < end && step > 0) || (start > end && step < 0);
    }
}
