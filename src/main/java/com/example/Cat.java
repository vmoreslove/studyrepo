package com.example;

public class Cat extends Animal {
    public Cat(String name) {
        super(name); // вызываем конструктор родителя
    }
    @Override
    public void eat() {
        System.out.println("кошка ест");
    }
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
    @Override
    public String toString() {
        return "Кошка по имени " + name;
    }
}

