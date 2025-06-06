package com.example;

public class Student extends Person {
    int grade;
    public Student(int age, String name, int grade) {
        super(age, name);
        this.grade = grade;
    }


    @Override
    public String toString() {
        return super.toString();
    }


}
