package com.kuntsevich.lesson3.entity;

import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.validator.ParameterValidator;

public class Ball {

    private Color color;
    private double weight;

    public Ball(Color color, double weight) throws IncorrectDataException {
        ParameterValidator parameterValidator = new ParameterValidator();
        if (!parameterValidator.validateWeight(weight)) {
            throw new IncorrectDataException("Incorrect ball parameter");
        }
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return this.color == ball.color && this.weight == ball.weight;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color=").append(color);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
