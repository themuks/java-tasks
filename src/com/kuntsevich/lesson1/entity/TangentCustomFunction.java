package com.kuntsevich.lesson1.entity;

public class TangentCustomFunction implements CustomFunction {

    @Override
    public double calcValue(double x) {
        return Math.tan(x);
    }
}
