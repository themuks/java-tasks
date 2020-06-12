package com.kuntsevich.lesson2.service;

import com.kuntsevich.lesson2.exception.IncorrectDataException;
import com.kuntsevich.lesson2.validator.WordValidator;

public class HelloService {

    public String sayHello(String name) throws IncorrectDataException {
        WordValidator wordValidator = new WordValidator();
        if (!wordValidator.validateName(name)) {
            throw new IncorrectDataException("Incorrect name");
        }
        StringBuilder sb = new StringBuilder("Hello, ");
        sb.append(name).append(", nice to meet you!");
        return sb.toString();
    }
}
