package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog());
        zoo.add(new Cat());

        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }
}
/*
Полиморфизм: Зоопарк
        Описани
        Создайте массив List<Animal>, в котором будут объекты Dog, Cat, Cow. Пройдитесь по списку и вызовите makeSound().
        Ожидаемый результат:
        Dog barks
        Cat meows
 */