package com.example;

public class Dog extends Animal{
    private int age;

    // Конструктор
    public Dog(String name, int age) {
        super("Найда"); // вызываем конструктор родителя
        this.age = age;
    }
    @Override
    public void makeSound() {
        System.out.println("гаав");
    }

    @Override
    public String toString() {
        return "Собака по имени " + name + ", возраст: " + age;
    }
}
