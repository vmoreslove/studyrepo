package com.example;

abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
            System.out.println(name + " ест");
        }

    public abstract void makeSound();

}
