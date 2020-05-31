package com.themuks.task10;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task10Solver implements Solver {

    /* Задача: Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
    Результат представить в виде таблицы, первый столбец которой – значения аргумента,
    второй - соответствующие значения функции. */

    private float a, b, h;

    // Погрешность
    private final float EPS = 0.00001f;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        h = in.nextFloat();
        return true;
    }

    @Override
    public String solve() {
        StringBuilder result = new StringBuilder();
        double fx;
        while (b - a >= 0) {
            fx = Math.tan(a);
            result.append(a).append(" ").append(fx).append("\n");
            a += h;
        }
        return result.toString();
    }
}