package com.example;

import java.util.Objects;

public class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false; // сравниваем name и age из Person
        Student student = (Student) o;
        return grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade); // комбинируем с hash из Person
    }
*/
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

