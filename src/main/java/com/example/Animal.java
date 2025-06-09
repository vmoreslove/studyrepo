package com.example;

abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void makeSound();

}
