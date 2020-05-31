package com.themuks.task1;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task1Solver implements Solver {

    /* Задание: Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата. */

    private int num = 0;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (in.hasNextInt())
            num = in.nextInt();
        else
            return false;
        in.close();
        return true;
    }

    @Override
    public String solve() {
        String strnum = Integer.toString(num);
        char lastChar = strnum.charAt(strnum.length() - 1);
        int result = lastDigitOfSqr(Character.getNumericValue(lastChar));
        return Integer.toString(result);
    }

    private int lastDigitOfSqr(int a) {
        return (a * a)%10;
    }
}
