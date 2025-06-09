package com.example;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Рэкс");
        System.out.println(dog);
        dog.eat();
        dog.makeSound();
        Cat cat = new Cat("Люся");
        System.out.println(cat);
        cat.eat();
        cat.makeSound();
        }
}
/*
2. Наследование: Иерархия животных
Описание Создайте абстрактный класс Animal с методом makeSound() и полем name.Создайте классы Dog и Cat, наследующие Animal, и реализуйте метод makeSound().
Дополнительно: добавьте метод eat() в Animal, общий для всех животных.
 */