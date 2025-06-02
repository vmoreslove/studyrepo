package com.example;

public class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("оценка: " + grade);
    }

    @Override
    public String toString() {
        return super.toString() + ", оценка: " + grade;
    }
}

