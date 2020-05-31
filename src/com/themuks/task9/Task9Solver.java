package com.themuks.task9;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task9Solver implements Solver {

    /* Задача: Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. */

    private float radius;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        radius = in.nextFloat();
        return true;
    }

    @Override
    public String solve() {
        // L = 2*pi*r; S = pi*r*r
        double circleLength = 2 * Math.PI * radius;
        double circleAreaSize = Math.PI * radius * radius;
        return "Длина окружности: " + circleLength + "; площадь окружности: " + circleAreaSize;
    }
}