package com.kuntsevich.lesson2.main;

import com.kuntsevich.lesson2.parser.DataParser;
import com.kuntsevich.lesson2.service.CalendarService;

public class Task6Main {

    public static void main(String[] args) {
        if (args.length > 1) {
            DataParser dataParser = new DataParser();
            String surname = args[0];
            Integer days = dataParser.parseInteger(args[1]);
            if (days != null) {
                CalendarService calendarService = new CalendarService();
                String info = calendarService.deadlineInfo(surname, days);
                System.out.println(info);
            } else {
                System.out.println("Incorrect data!");
            }
        }
    }
}
