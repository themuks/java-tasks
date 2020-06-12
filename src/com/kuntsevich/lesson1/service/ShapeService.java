package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.entity.CustomPoint;
import com.kuntsevich.lesson1.exception.IncorrectDataException;
import com.kuntsevich.lesson1.validator.ShapeValidator;

public class ShapeService {

    public double squareAreaSizeInCircleInSquare(double outerSquareAreaSize) throws IncorrectDataException {
        ShapeValidator shapeValidator = new ShapeValidator();
        if (!shapeValidator.validateAreaSize(outerSquareAreaSize)) {
            throw new IncorrectDataException("Area size lower than zero.");
        }
        double squareSideLength = Math.sqrt(outerSquareAreaSize);
        return Math.pow(squareSideLength, 2)/2;
    }

    public double innerSquareAreaSizeCoefficient(double outerSquareAreaSize) throws IncorrectDataException {
        return outerSquareAreaSize/squareAreaSizeInCircleInSquare(outerSquareAreaSize);
    }

    public int compareVectorLength(double x1, double y1, double x2, double y2) {
        CustomPoint a = new CustomPoint(x1, y1);
        CustomPoint b = new CustomPoint(x2, y2);
        double length1 = Math.hypot(a.getX(), a.getY());
        double length2 = Math.hypot(b.getX(), b.getY());
        return Double.compare(length1, length2);
    }

    public double calcCircumference(double radius) throws IncorrectDataException {
        ShapeValidator shapeValidator = new ShapeValidator();
        if (!shapeValidator.validateRadius(radius)) {
            throw new IncorrectDataException("Incorrect radius value");
        }
        return 2*Math.PI*radius;
    }

    public double calcAreaSize(double radius) throws IncorrectDataException {
        ShapeValidator shapeValidator = new ShapeValidator();
        if (!shapeValidator.validateRadius(radius)) {
            throw new IncorrectDataException("Incorrect radius value");
        }
        return Math.PI*Math.pow(radius, 2);
    }
}
