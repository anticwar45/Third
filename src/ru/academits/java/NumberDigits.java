package ru.academits.java;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int numberModulus = Math.abs(number);

        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        for (int i = numberModulus; i > 0; i /= 10) {
            int lastDigit = i % 10;
            allDigitsSum += lastDigit;

            if (i % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }
        }

        System.out.println("Сумма цифр введенного числа равна " + allDigitsSum);
        System.out.println("Сумма нечетных цифр введенного числа равна " + oddDigitsSum);
        System.out.println("Максимальная цифра введенного числа " + maxDigit);
    }
}