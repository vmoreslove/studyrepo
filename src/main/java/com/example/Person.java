
package com.example;


class Person {
    String name;
    int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    // Переопределение метода toString для удобного вывода
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


