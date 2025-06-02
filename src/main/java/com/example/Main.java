package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> personMap = new HashMap<>();
        Person roma = new Person("roma", 19);
        Person grisha = new Person("grisha", 17);
        Person mitya = new Person("персон",16);
        Student petya = new Student("студент",18,5);
        personMap.put(mitya, "Engineer");
        personMap.put(petya, "Designer");
        Student s1 = new Student("Анна", 20, 4);
        Student s2 = new Student("Анна", 20, 5);

        System.out.println(s1.equals(s2)); // false — потому что grade разный


        System.out.println("персон и студент равны? " + mitya.equals(petya));
        System.out.println("Значение по персон: " + personMap.get(mitya)); // получит значение по ключу митя

        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}

/*
Услов   Есть класс Person с полями String name и int age. Ты используешь объекты Person в качестве ключей в HashMap<Person, String>.
	•	Реализуй Person так, чтобы объекты можно было использовать как ключи без проблем.
	•	Объясни, почему важно корректно переопределить equals() и hashCode().
	•	Что произойдёт, если поля, участвующие в hashCode(), будут изменены после вставки объекта в HashMap?
 */