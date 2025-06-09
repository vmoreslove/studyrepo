package com.example;

public class Dog extends Animal{

    public Dog(String name) {
        super(name); // вызываем конструктор родителя
    }

    @Override
    public void eat() {
        System.out.println("я ем");
    }

    @Override
    public void makeSound(){
        System.out.println("gaav");
    }

    @Override
    public String toString() {
        return "Собака по имени " + name;
    }
}
