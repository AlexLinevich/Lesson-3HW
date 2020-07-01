package com.itacademy.lesson3;

import java.util.Scanner;

public class Lesson3HW2 {

    /**
     * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые
     * пользователем из консоли данные.
     * Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
     * При решении создать и использовать следующие вынесенные функции:
     * - функция isPositive, определяющая, является ли число положительным
     * - функция isZero, определяющая, является ли число нулём
     * - функция discriminant, вычисляющая дискриминант
     */
    public static void main(String[] args) {
//        double a1 = 1;     //  1; // нет корней,      1; // один корень 2,     1;  // два корня: 1, -4
//        double b1 = -5;    // -5; // нет корней,     -4; // один корень 2,     3;  // два корня: 1, -4
//        double c1 = 9;     //  9; // нет корней,      4; // один корень 2,    -4;  // два корня: 1, -4
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a1 = myScanner.nextDouble();
        System.out.print("Введите b: ");
        double b1 = myScanner.nextDouble();
        System.out.print("Введите c: ");
        double c1 = myScanner.nextDouble();
        double D = discriminant(a1, b1, c1);
        double x, x1, x2;
        if (isPositive(D)) {
            x1 = (-b1 + Math.sqrt(D)) / 2 * a1;
            x2 = (-b1 - Math.sqrt(D)) / 2 * a1;
            System.out.println("Уравнение имеет два корня X1: " + x1 + " , и X2: " + x2);
        } else if (isZero(D)) {
            x = -b1 / 2 * a1;
            System.out.println("Уравнение имеет один корень X: " + x);
        } else
            System.out.println("Уравнение не имеет действительных корней");
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static boolean isPositive(double DD) {
        return DD > 0;
    }

    public static boolean isZero(double DD) {
        return DD == 0;
    }
}
