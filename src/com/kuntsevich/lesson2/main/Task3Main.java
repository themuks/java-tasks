package com.kuntsevich.lesson2.main;

import com.kuntsevich.lesson2.exception.IncorrectDataException;
import com.kuntsevich.lesson2.parser.DataParser;
import com.kuntsevich.lesson2.service.RandomService;

public class Task3Main {

    public static void main(String[] args) {
        RandomService randomService = new RandomService();
        if (args.length > 0) {
            DataParser dataParser = new DataParser();
            String arg = args[0];
            Integer count = dataParser.parseInteger(arg);
            if (count != null) {
                int[] randomNumbers = new int[0];
                try {
                    randomNumbers = randomService.generateNumbers(count);
                } catch (IncorrectDataException e) {
                    System.out.println("Incorrect count value");
                }
                for (int number : randomNumbers) {
                    System.out.println(number);
                }
                for (int number : randomNumbers) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
