package com.themuks;

import com.themuks.task1.Task1Solver;
import com.themuks.task10.Task10Solver;
import com.themuks.task2.Task2Solver;
import com.themuks.task3.Task3Solver;
import com.themuks.task4.Task4Solver;
import com.themuks.task5.Task5Solver;
import com.themuks.task6.Task6Solver;
import com.themuks.task7.Task7Solver;
import com.themuks.task8.Task8Solver;
import com.themuks.task9.Task9Solver;
import com.themuks.util.Solver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите задание:\n"
                + "1 - Задание 1\n"
                + "2 - Задание 2\n"
                + "3 - Задание 3\n"
                + "4 - Задание 4\n"
                + "5 - Задание 5\n"
                + "6 - Задание 6\n"
                + "7 - Задание 7\n"
                + "8 - Задание 8\n"
                + "9 - Задание 9\n"
                + "10 - Задание 10\n"
                + "Другое - Выход");
        int choice;
        System.out.print("Ваш выбор: ");
        if (in.hasNextInt()) {
            choice = in.nextInt();
            Solver solver = null;
            switch (choice) {
                case 1:
                    solver = new Task1Solver();
                    break;
                case 2:
                    solver = new Task2Solver();
                    break;
                case 3:
                    solver = new Task3Solver();
                    break;
                case 4:
                    solver = new Task4Solver();
                    break;
                case 5:
                    solver = new Task5Solver();
                    break;
                case 6:
                    solver = new Task6Solver();
                    break;
                case 7:
                    solver = new Task7Solver();
                    break;
                case 8:
                    solver = new Task8Solver();
                    break;
                case 9:
                    solver = new Task9Solver();
                    break;
                case 10:
                    solver = new Task10Solver();
                    break;
            }
            if (solver != null) {
                if (solver.input())
                    System.out.println("Вывод: " + solver.solve());
                else
                    System.out.println("Данные введены неверно!");
            }
        }
    }
}
