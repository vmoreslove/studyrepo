package com.example;

import java.util.*;

public class Fruits1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "grape"
        );

        Set<String> fruits = new LinkedHashSet<>(words);
        List<String> items = new ArrayList<>(fruits);

        System.out.println(items);

    }
}
/*Удаление дубликатов из списка
1       Условие Есть список строк. Удалите из него дубликаты, сохранив порядок следования элементов.
        List<String> input = Arrays.asList();
// Output: ["apple", "banana", "orange", "grape"]
        Цель: Понимание Set, LinkedHashSet, List.
 */