package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.entity.Point;
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
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double length1 = Math.hypot(a.getX(), a.getY());
        double length2 = Math.hypot(b.getX(), b.getY());
        return Double.compare(length1, length2);
    }
}
