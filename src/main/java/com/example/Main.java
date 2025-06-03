package com.example;

public class Main {
    public static void main(String[] args) {
        Dog felix = new Dog("sfinx" ,"alabay");

        System.out.println(felix.getName() + " " + felix.getBreed());
        }

}
    /*Есть базовый класс Animal с полем name. Есть класс Dog, наследующий Animal, с дополнительным полем breed.
        •	Реализуй оба класса с конструкторами, чтобы можно было создавать Dog с именем и породой.

        •	Покажи вызов конструктора родителя из конструктора дочернего класса.
        •	Объясни порядок инициализации объектов при наследовании.
        •	Реализовать equals и hashCode

     */