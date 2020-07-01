package com.itacademy.lesson3;

import java.util.Scanner;

public class Lesson3HW1 {

    /**
     * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
     * Вывести дату следующего дня в формате "День.Месяц.Год".
     * Учесть переход на следующий месяц, а также следующий год.
     * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию
     */
    public static void main(String[] args) {
//        int day1 = 29;
//        int month1 = 2;
//        int year1 = 2000;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day1 = myScanner.nextInt();
        System.out.print("Введите месяц: ");
        int month1 = myScanner.nextInt();
        System.out.print("Введите год: ");
        int year1 = myScanner.nextInt();
        nextDate(day1, month1, year1);
    }

    private static void nextDate(int day, int month, int year) {
        int nextDay, nextMonth, nextYear;
        if (month == 12 && day == 31) {
            nextDay = 1;
            nextMonth = 1;
            nextYear = year + 1;
        } else if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 31))
                || ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30))
                || ((month == 2) && (day == 28) && !isLeapYear(year))
                || ((month == 2) && (day == 29) && isLeapYear(year))) {
            nextDay = 1;
            nextMonth = month + 1;
            nextYear = year;
        } else {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        }
        System.out.print("Дата следующего дня: " + nextDay + "." + nextMonth + "." + nextYear);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

