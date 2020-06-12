package com.kuntsevich.lesson2.main;

import com.kuntsevich.lesson2.service.PasswordService;

public class Task4Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            String password = args[0];
            PasswordService passwordService = new PasswordService();
            if (passwordService.isEqualsToSample(password)) {
                System.out.println("Correct password");
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}
