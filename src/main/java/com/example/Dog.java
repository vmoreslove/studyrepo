package com.example;


import java.util.Objects;

public class Dog extends Animal {
    public String getBreed() {
        return breed;
    }
    String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}
