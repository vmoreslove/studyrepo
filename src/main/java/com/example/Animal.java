package com.example;


import java.util.Objects;

public class Animal {
    public String getName() {
        return name;
    }
    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    String name;
    public void makeSound() {
        System.out.println("я издаю звуки");

    }
}
