package com.kuntsevich.lesson2.service;

import com.kuntsevich.lesson2.exception.IncorrectDataException;
import com.kuntsevich.lesson2.validator.NumberValidator;

import java.util.Random;

public class RandomService {

    public int[] generateNumbers(int count) throws IncorrectDataException {
        NumberValidator numberValidator = new NumberValidator();
        if (!numberValidator.validateCount(count)) {
            throw new IncorrectDataException("Incorrect count value");
        }
        Random random = new Random();
        return random.ints(count).toArray();
    }
}
