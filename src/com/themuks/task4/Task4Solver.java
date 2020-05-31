package com.themuks.task4;

import com.themuks.util.Solver;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4Solver implements Solver {

    /* Задача: Составить программу, печатающую значение true, если указанное высказывание
    является истинным, и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных. */

    private ArrayList<Integer> numArray = new ArrayList<>();

    private final int COUNT = 4;

    @Override
    public boolean input() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < COUNT; i++) {
            System.out.print("Введите " + (i + 1) + "-е число: ");
            if (in.hasNextInt())
                numArray.add(in.nextInt());
            else
                return false;
        }
        return true;
    }

    @Override
    public String solve() {
        int counter = 0;
        for (var num : numArray)
            if (num % 2 == 0)
                counter++;
        if (counter >= 2)
            return "true";
        return "false";
    }
}