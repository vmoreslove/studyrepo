package com.example;

public abstract class Animal {
     String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}