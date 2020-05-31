package com.themuks.task8;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task8Solver implements Solver {

    /* Задача: Вычислить значение функции ... */

    private float x;

    // Погрешность
    private final float EPS = 0.00001f;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        x = in.nextFloat();
        return true;
    }

    @Override
    public String solve() {
        float result;
        if (Math.abs(x*x*x - 6) < EPS)
            return "X не входит в область определения!";
        if (x < 3)
            result = 1/(x*x*x - 6);
        else
            result = -(x*x)+3*x+9;
        return Float.toString(result);
    }
}