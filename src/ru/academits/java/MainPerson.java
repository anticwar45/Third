package ru.academits.java;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String middleName;
        String familyName;
        int age;

        do {
            System.out.println("Введите имя персонажа (имя не может быть пустым):");
            name = scanner.nextLine();
        }
        while (name.isEmpty());

        System.out.println("Введите отчество персонажа:");
        middleName = scanner.nextLine();

        if (middleName.isEmpty()) {
            middleName = "Не указано";
        }

        do {
            System.out.println("Введите фамилию персонажа (фамилия не может быть пустой):");
            familyName = scanner.nextLine();
        }
        while (familyName.isEmpty());

        do {
            System.out.println("Введите возраст персонажа (возраст может быть от 1 до 120):");
            age = scanner.nextInt();
        }
        while (age <= 0 || age > 120);

        Person person = new Person(name, middleName, familyName, age);

        System.out.println("Вашего персонажа зовут - " + person.getName());
        System.out.println("Отчетство вашего персонажа - " + person.getMiddleName());
        System.out.println("Фамилия вашего персонажа - " + person.getFamilyName());
        System.out.println("Возраст вашего персонажа - " + person.getAge());
        System.out.println("Год рождения вашего персонажа - " + person.getBirthYear());
    }
}