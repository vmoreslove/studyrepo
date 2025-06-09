package com.example;

public class Dog extends Animal{
    public Dog() {
        super("Найда");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " " + "barks");
    }
}