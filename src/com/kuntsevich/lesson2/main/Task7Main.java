package com.kuntsevich.lesson2.main;

import com.kuntsevich.lesson2.exception.IncorrectDataException;
import com.kuntsevich.lesson2.parser.DataParser;
import com.kuntsevich.lesson2.service.CalendarService;

import java.util.List;

public class Task7Main {

    public static void main(String[] args) {
        if (args.length > 2) {
            DataParser dataParser = new DataParser();
            StringBuilder sb = new StringBuilder(args[0]);
            sb.append(" ").append(args[1]).append(" ");
            sb.append(args[2]);
            List<Integer> date = dataParser.parseDate(sb.toString());
            if (date.size() == 3) {
                CalendarService calendarService = new CalendarService();
                int day = date.get(0);
                int month = date.get(1);
                int year = date.get(2);
                String birthdayInfo;
                try {
                    birthdayInfo = calendarService.birthdayInfo(day, month, year);
                    System.out.println(birthdayInfo);
                } catch (IncorrectDataException e) {
                    System.out.println("Incorrect data!");
                }
            } else {
                System.out.println("Incorrect data!");
            }
        }
    }
}
