package com.kuntsevich.lesson2.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {

    public Integer parseInteger(String data) {
        if (data.matches("-?\\d{1,6}")) {
            return Integer.valueOf(data);
        }
        return null;
    }

    public List<Integer> parseDate(String data) {
        List<Integer> ints = new ArrayList<>();
        Arrays.stream(data.split("\\s+"))
                .filter(s -> s.matches("-?\\d{1,6}"))
                .forEach(i -> ints.add(Integer.valueOf(i)));
        return ints;
    }
}
