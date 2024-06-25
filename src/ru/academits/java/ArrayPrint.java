package ru.academits.java;

public class ArrayPrint {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (isMultipleOf4(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static boolean isMultipleOf4(int number) {
        return number % 4 == 0;
    }
}