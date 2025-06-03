package com.example;

public class Student extends Person {
    int grade = 5;

    @Override
    public void printInfo() {
        System.out.println("имя: " + name + ", возраст: " + age + ", оценка: " + grade);
    }
}
