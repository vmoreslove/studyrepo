package com.example;

public class Student extends Person {
    int grade = 5;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("оценка " + grade);
    }
}
