package com.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 8);
        rectangle.getArea();

        Circle circle = new Circle(6);
        circle.getArea();
    }
}
/*
Абстракция: Фигуры
Описание: Создайте абстрактный класс Shape с методом getArea(). Создайте классы Circle, Rectangle, Triangle.
Требования Каждый класс должен реализовать метод подсчёта площади.
 */