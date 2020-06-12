package com.kuntsevich.lesson2.main;

import com.kuntsevich.lesson2.exception.IncorrectDataException;
import com.kuntsevich.lesson2.service.HelloService;

public class Task1Main {

    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        String result = "";
        if (args.length > 0) {
            String name = args[0];
            try {
                result = helloService.sayHello(name);
            } catch (IncorrectDataException e) {
                System.out.println("Incorrect name");
            }
        }
        System.out.println(result);
    }
}
