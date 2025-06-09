package com.example;

public class Cat extends Animal{
    public Cat() {
        super("Luce");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " " + "meows");
    }
}
