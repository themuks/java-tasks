package com.kuntsevich.lesson2.main;

import com.kuntsevich.lesson2.parser.DataParser;
import com.kuntsevich.lesson2.service.NumberService;

import java.util.ArrayList;
import java.util.List;

public class Task5Main {

    public static void main(String[] args) {
        DataParser dataParser = new DataParser();
        boolean numberFound = false;
        List<Integer> nums = new ArrayList<>();
        for (String arg : args) {
            Integer number = dataParser.parseInteger(arg);
            if (number != null) {
                numberFound = true;
                nums.add(number);
            }
        }
        if (numberFound) {
            NumberService numberService = new NumberService();
            long sum = numberService.calcSum(nums);
            long product = numberService.calcProduct(nums);
            System.out.printf("Sum = %d; product = %d%n", sum, product);
        } else {
            System.out.println("There are no numbers!");
        }
    }
}
