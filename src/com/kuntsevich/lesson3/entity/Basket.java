package com.kuntsevich.lesson3.entity;

import com.kuntsevich.lesson3.exception.IncorrectDataException;
import com.kuntsevich.lesson3.validator.ParameterValidator;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final int maxCount;
    private final double maxWeight;

    private List<Ball> balls = new ArrayList<>();

    public Basket(int maxCount, double maxWeight) throws IncorrectDataException {
        ParameterValidator parameterValidator = new ParameterValidator();
        if (!parameterValidator.validateMaxCount(maxCount) || !parameterValidator.validateMaxWeight(maxWeight)) {
            throw new IncorrectDataException("Incorrect basket parameters");
        }
        this.maxCount = maxCount;
        this.maxWeight = maxWeight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Basket basket = (Basket) o;
        return this.maxCount == basket.maxCount
                && this.maxWeight == basket.maxWeight
                && this.balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = maxCount;
        temp = Double.doubleToLongBits(maxWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + balls.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("maxCount=").append(maxCount);
        sb.append(", maxWeight=").append(maxWeight);
        sb.append(", balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }
}
