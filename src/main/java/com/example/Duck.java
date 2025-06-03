package com.example;

public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("few");
    }

    @Override
    public void swim() {
        System.out.println("бульк");
    }

    @Override
    public void move() {
        System.out.println("я двигаюсь");
    }
}
