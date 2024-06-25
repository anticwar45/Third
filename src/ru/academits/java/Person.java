package ru.academits.java;

import java.util.Calendar;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    private Calendar calendar = Calendar.getInstance();

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }

        System.out.println("Имя было изменено");
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!familyName.isEmpty()) {
            this.familyName = familyName;
        }

        System.out.println("Фамилия была изменена");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <= 120) {
            this.age = age;
        }
        System.out.println("Возраст изменен");
    }

    public String toString () {
        return "{" + name + " " + middleName + " " + familyName + "}";
    }

    public int getBirthYear () {
        return calendar.get(Calendar.YEAR) - age;
    }
}