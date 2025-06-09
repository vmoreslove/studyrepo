package com.example;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Рэкс", 5);
        System.out.println(dog);
        dog.eat();
        dog.makeSound();
        }
}
/*
2. Наследование: Иерархия животных
Описание: Создайте абстрактный класс Animal с методом makeSound() и полем name. Создайте классы Dog и Cat, наследующие Animal, и реализуйте метод makeSound().
Дополнительно: добавьте метод eat() в Animal, общий для всех животных.

3. Полиморфизм: Зоопарк
Описание: Создайте массив List<Animal>, в котором будут объекты Dog, Cat, Cow. Пройдитесь по списку и вызовите makeSound().
Ожидаемый результат:
Dog barks
Cat meows
Cow moos
 */