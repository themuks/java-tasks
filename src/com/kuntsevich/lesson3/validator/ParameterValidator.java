package com.kuntsevich.lesson3.validator;

public class ParameterValidator {

    public boolean validateWeight(double weight) {
        return weight > 0;
    }

    public boolean validateMaxCount(int maxCount) {
        return maxCount > 0;
    }

    public boolean validateMaxWeight(double maxWeight) {
        return maxWeight > 0;
    }
}
