package com.kuntsevich.lesson1.entity;

public class TangentFunction implements Function {

    @Override
    public double getValue(double x) {
        return Math.tan(x);
    }
}
