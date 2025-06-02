package com.example;
public class Main {
    public static void main(String[] args) {
        DayWeek day = DayWeek.WEDNESDAY;

        if (day.isWeekend()) {
            System.out.println(day + " — это выходной");
        } else {
            System.out.println(day + " — это рабочий день");
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {
        DayWeek today = DayWeek.FRIDAY;

        if (today.isWeekend()) {
            System.out.println(today + " — это выходной");
        } else {
            System.out.println(today + " — это рабочий день");
        }
    }
}

*/



//Задача 3. Enum и switch
       /* Условие Создай enum Day с днями недели.
            •	Напиши метод, который принимает Day и возвращает, выходной это или рабочий день.
        •	Используй switch с выражениями case на enum.
        •	Продемонстрируй использование нового синтаксиса switch из Java 14+ (arrow case).

        */