package com.kuntsevich.lesson2.service;

public class PasswordService {

    private final String SAMPLE_STRING = "123qwe";

    public boolean isEqualsToSample(String str) {
        if (str != null) {
            return str.equals(SAMPLE_STRING);
        }
        return false;
    }
}
