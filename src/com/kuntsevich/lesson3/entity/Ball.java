package com.kuntsevich.lesson3.entity;

import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.validator.ParameterValidator;

public class Ball {

    private final Color color;
    private final double weight;
    private final double volume;

    public Ball(Color color, double weight, double volume) throws IncorrectDataException {
        ParameterValidator parameterValidator = new ParameterValidator();
        if (!parameterValidator.validateWeight(weight) || !parameterValidator.validateMaxVolume(volume)) {
            throw new IncorrectDataException("Incorrect ball parameters");
        }
        this.color = color;
        this.weight = weight;
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
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
        return this.color == ball.color
                && this.weight == ball.weight
                && this.volume == ball.volume;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color=").append(color);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }
}
