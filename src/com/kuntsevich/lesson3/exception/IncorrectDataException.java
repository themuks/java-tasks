package com.kuntsevich.lesson3.exception;

public class IncorrectDataException extends Exception {

    public IncorrectDataException() {
        super();
    }

    public IncorrectDataException(String message) {
        super(message);
    }

    public IncorrectDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectDataException(Throwable cause) {
        super(cause);
    }
}
