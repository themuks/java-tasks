package com.themuks.task7;

import com.themuks.util.Solver;

import java.util.Scanner;

public class Task7Solver implements Solver {

    /* Задача: Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
    которая из точек находится ближе к началу координат. x y. */

    private float x1, y1, x2, y2;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        x2 = in.nextFloat();
        y2 = in.nextFloat();
        return true;
    }

    @Override
    public String solve() {
        // Теорема пифагора, получаем длину гипотенузы
        double length1 = Math.sqrt(x1*x1 + y1*y1);
        double length2 = Math.sqrt(x2*x2 + y2*y2);
        if (length1 < length2)
            return x1 + " " + y1;
        return x2 + " " + y2;
    }
}