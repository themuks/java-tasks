package com.kuntsevich.lesson1.entity;

public class EquationCustomFunction implements CustomFunction {

    @Override
    public double calcValue(double x) {
        if (x >= 3) {
            return -Math.pow(x, 2) + 3*x + 9;
        } else {
            return 1/(Math.pow(x, 3) - 6);
        }
    }
}
