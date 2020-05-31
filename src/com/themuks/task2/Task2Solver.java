package com.themuks.task2;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task2Solver implements Solver {

    /* Задание: Составить программу, которая по заданным году и номеру месяца определяет
    количество дней в этом месяце и корректно определялись все високосные года. */

    private int year;
    private int month;

    private final int[] MONTH_DAY_COUNT = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        if (in.hasNextInt())
            year = in.nextInt();
        System.out.print("Введите номер месяца: ");
        if (in.hasNextInt())
            month = in.nextInt();
        if (year >= 0 && month > 0 && month <= 12)
            return true;
        return false;
    }

    @Override
    public String solve() {
        int dayCount = MONTH_DAY_COUNT[month - 1];
        if (month == 2 && isLeap(year))
            dayCount++;
        return Integer.toString(dayCount);
    }

    private boolean isLeap(int year) {
        // Если год кратен 400, то он вискокосный
        if (year % 400 == 0)
            return true;
        // Остальные кратные 100 не високосные
        else if (year % 100 == 0)
            return false;
        // Остальные не кратные 100, а кратные 4 високосные
        else if (year % 4 == 0)
            return true;
        return false;
    }
}
