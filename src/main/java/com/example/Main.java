package com.example;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Список объектов Person
        List<Person> people = List.of(
                new Person("Анна", 20),
                new Person("Борис", 22),
                new Person("Анна", 21),
                new Person("Виктор", 18),
                new Person("Гриша", 19),
                new Person("Даша", 17),
                new Person("Егор", 17),
                new Person("Мария", 30),
                new Person("Алексей", 20)
        );

        // 1. Выводим уникальные имена, отсортированные по алфавиту
        people.stream()
                .map(person -> person.name)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        /* 2. Вычисляем средний возраст
        String result = people.stream()
                .mapToInt(Person::getAge)  // Преобразуем Person в int (возраст)
                .average()                 // Вычисляем среднее
                .mapToObj(avg -> "Средний возраст: " + avg)  // Преобразуем OptionalDouble в строку
                .orElse("Not found");      // Если пусто, возвращаем "Not found"

        System.out.println(result);
*/
        // 3. Находим первого человека старше 30 лет
        Optional<Person> personOver30 = people.stream()
                .filter(person -> person.getAge() > 30)  // Отбираем людей старше 30 лет
                .findFirst();                           // Находим первого

        // Выводим результат: если есть человек старше 30 лет, выводим его, иначе "Not found"
        System.out.println(personOver30.map(person -> "Первый человек старше 30 лет: " + person)
                .orElse("Not found"));
    }
}


//Задача 2. Коллекции и Stream API
//Дан список объектов Person с полями name и age.
//Выведи список уникальных имен, отсортированных по алфавиту, используя Stream API.
//Посчитай средний возраст всех людей.
//Найди первого человека старше 30 лет или выведи "Not found", если такого нет.