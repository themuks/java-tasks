package com.kuntsevich.lesson1.validator;

public class ShapeValidator {

    public boolean validateAreaSize(double areaSize) {
        return areaSize >= 0;
    }

    public boolean validateRadius(double radius) {
        return radius >= 0;
    }
}
