package ru.academits.java;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число диапазона:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число диапазона:");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Числа равны диапазон не образуют");
        } else {
            int startNumber = Math.min(number1, number2);
            int endNumber = Math.max(number1, number2);

            int allNumbersCount = 0;
            int evenNumbersCount = 0;

            int allNumbersSum = 0;
            int evenNumbersSum = 0;

            for (int i = startNumber; i <= endNumber; i++) {
                allNumbersSum += i;
                allNumbersCount++;

                if (i % 2 == 0) {
                    evenNumbersSum += i;
                    evenNumbersCount++;
                }
            }

            double allNumbersArithmeticMean = (double) allNumbersSum / allNumbersCount;
            System.out.println("Среднее арифметическое чисел указанного диапазона равно " + allNumbersArithmeticMean);

            double evenNumbersArithmeticMean = (double) evenNumbersSum / evenNumbersCount;
            System.out.println("Среднее арифметическое четных чисел указанного диапазона равно " + evenNumbersArithmeticMean);
        }
    }
}