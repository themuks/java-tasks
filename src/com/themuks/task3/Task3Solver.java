package com.themuks.task3;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task3Solver implements Solver {

    /* Задача: Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
    вписанного в эту окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного? */

    private float areaSize;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите площадь квадрата: ");
        if (in.hasNextFloat())
            areaSize = in.nextFloat();
        else
            return false;
        if (areaSize < 0)
            return false;
        return true;
    }

    @Override
    public String solve() {
        double radius = Math.sqrt(areaSize)/2;
        // S = 4 * r * r / 2
        double innerSquareAreaSize = 2*radius*radius;
        return Double.toString(innerSquareAreaSize);
    }
}