package com.example;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Анна", 20),
                new Person("Борис", 22),
                new Person("Анна", 21),
                new Person("Виктор", 18),
                new Person("Гриша", 19),
                new Person("Даша", 17),
                new Person("Егор", 17),
                new Person("Мария", 30),
                new Person("Алексей", 40)
        );
        people.stream()
                .map(person -> person.name)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();

        if (average.isPresent()) {
            System.out.println("Среднее значение: " + average.getAsDouble());
        } else {
            System.out.println("Коллекция пуста, среднее значение не может быть вычислено.");
        }
        Optional<Person> personOver30 = people.stream()
                .filter(person -> person.getAge() > 30)
                .findFirst();


        System.out.println(personOver30.map(person -> "Первый человек старше 30 лет: " + person)
                .orElse("Not found"));
    }
}


//Задача 2. Коллекции и Stream API
//Дан список объектов Person с полями name и age.
//Выведи список уникальных имен, отсортированных по алфавиту, используя Stream API.
//Посчитай средний возраст всех людей.
//Найди первого человека старше 30 лет или выведи "Not found", если такого нет.