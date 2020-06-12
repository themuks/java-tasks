package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.entity.CustomFunction;
import com.kuntsevich.lesson1.exception.IncorrectDataException;
import com.kuntsevich.lesson1.validator.FunctionValidator;

import java.util.ArrayList;
import java.util.List;

public class NumberService {

    public int lastDigitOfNumber(int num) {
        return num % 10;
    }

    public int lastDigitOfSquaredNumber(int num) {
        int lastDigit = lastDigitOfNumber(num);
        int numberSquare = (int) Math.pow(lastDigit, 2);
        return lastDigitOfNumber(numberSquare);
    }

    public boolean isTwoEvenExist(int[] nums) {
        int evenCount = 0;
        for (var num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount >= 2;
    }

    public boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public double[] calcFunctionValues(CustomFunction customFunction, double start, double end, double step) throws IncorrectDataException {
        FunctionValidator functionValidator = new FunctionValidator();
        if (!functionValidator.validateFunctionBounds(start, end, step)) {
            throw new IncorrectDataException();
        }
        List<Double> list = new ArrayList<>();
        while (start <= end) {
            double value = customFunction.calcValue(start);
            list.add(value);
            start += step;
        }
        return list.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
