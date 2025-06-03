package com.example;

public class Car extends Vehicle {
    String nameCar;

    public Car(String typeTransport, String nameCar) {
        super(typeTransport);
        this.nameCar = nameCar;
        System.out.println(nameCar);
    }
}

/*
Создайте класс Vehicle с конструктором Vehicle(String type), который печатает тип транспорта. Создайте класс Car,
который вызывает конструктор родителя и дополняет его названием марки
*/
