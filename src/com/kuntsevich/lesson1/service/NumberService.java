package com.kuntsevich.lesson1.service;

import com.kuntsevich.lesson1.entity.Function;

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

    public double[] getFunctionValuesInRange(Function function, double a, double b, double step) {
        List<Double> list = new ArrayList<>();
        while (a <= b) {
            double value = function.getValue(a);
            list.add(value);
            a += step;
        }
        return list.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
