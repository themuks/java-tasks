package com.kuntsevich.lesson3.validator;

public class ParameterValidator {

    public static final double MAX_WEIGHT_VALUE = 1000;
    public static final double MAX_VOLUME_VALUE = 1000;

    public boolean validateWeight(double weight) {
        return 0 < weight && weight <= MAX_WEIGHT_VALUE;
    }

    public boolean validateMaxVolume(double maxVolume) {
        return 0 < maxVolume && maxVolume <= MAX_VOLUME_VALUE;
    }

    public boolean validateMaxWeight(double maxWeight) {
        return 0 < maxWeight && maxWeight <= MAX_WEIGHT_VALUE;
    }
}
