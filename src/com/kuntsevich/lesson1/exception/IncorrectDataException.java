package com.kuntsevich.lesson1.exception;

public class IncorrectDataException extends Exception {

    public IncorrectDataException() {
        super();
    }

    public IncorrectDataException(String message) {
        super(message);
    }
}
