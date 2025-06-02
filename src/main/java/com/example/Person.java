
package com.example;

import java.util.Objects;

public class Person {
    String name;
    int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Переопределяем hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Для печати
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public void printInfo() {
        System.out.println("имя: " + name + ", возраст: " + age);


 /*
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
       System.out.println("имя: " + name + ", возраст: " + age);

  */
    }
}
