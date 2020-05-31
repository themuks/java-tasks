package com.themuks.task5;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task5Solver implements Solver {

    /* Задача: Составить программу, печатающую значение true, если указанное высказывание является истинным,
    и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу). */

    private int num;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (in.hasNextInt())
            num = in.nextInt();
        else
            return false;
        if (num >= 1)
            return true;
        return false;
    }

    @Override
    public String solve() {
        int sum = 1;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                sum += i;
        if (sum == num)
            return "true";
        return "false";
    }
}