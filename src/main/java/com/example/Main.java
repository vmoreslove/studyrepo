package com.example;


public class Main {
    public static void main(String[] args) {
        Dog felix = new Dog();
        //felix.makeSound();
        Cat julya = new Cat();
        //julya.makeSound();
            Animal[] zoo = {felix,julya};
            for (Animal animal : zoo){
            animal.makeSound();
        }
    }
}
