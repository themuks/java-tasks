package com.themuks.task6;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task6Solver implements Solver {

    /* Задача: Идет n-я секунда суток, определить, сколько полных часов,
    полных минут и секунд прошло к этому моменту. */

    private final int SECONDS_IN_MINUTE = 60;
    private final int SECONDS_IN_HOUR = 60*SECONDS_IN_MINUTE;
    private final int SECONDS_IN_DAY = 24*SECONDS_IN_HOUR;

    private int num;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите секунду суток: ");
        if (in.hasNextInt())
            num = in.nextInt();
        else
            return false;
        if (num > 0 && num < SECONDS_IN_DAY)
            return true;
        return false;
    }

    @Override
    public String solve() {
        StringBuilder result = new StringBuilder();
        result.append("Прошло часов: ").append(num / SECONDS_IN_HOUR);
        num %= SECONDS_IN_HOUR;
        result.append(" минут: ").append(num / SECONDS_IN_MINUTE);
        num %= SECONDS_IN_MINUTE;
        result.append(" секунд: ").append(num);
        return result.toString();
    }
}