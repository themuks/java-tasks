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
        if (in.hasNextFloat())
            a = in.nextFloat();
        else
            return false;
        if (in.hasNextFloat())
            b = in.nextFloat();
        else
            return false;
        if (in.hasNextFloat())
            h = in.nextFloat();
        else
            return false;
        if (a < b && h < 0)
            return false;
        if (b < a && h > 0)
            return false;
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
        if (Math.abs(a - b) < EPS) {
            fx = Math.tan(a);
            result.append(a).append(" ").append(fx).append("\n");
        }
        return result.toString();
    }
}