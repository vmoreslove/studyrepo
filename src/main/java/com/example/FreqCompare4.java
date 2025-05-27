package com.example;

import java.util.*;


public class FreqCompare4 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("a", "b", "a", "c", "b", "a");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        List<String> sortedList = new ArrayList<>(items);

        sortedList.sort((o1, o2) -> {
            int freqCompare = frequencyMap.get(o2).compareTo(frequencyMap.get(o1));
            return freqCompare != 0 ? freqCompare : o1.compareTo(o2);
        });
        System.out.println(sortedList);
    }
}

/*
4        Условие Отсортируйте список строк по убыванию частоты их появления.
       List<String> words = Arrays.asList("a", "b", "a", "c", "b", "a");
// Output: [a, a, a, b, b, c]
        Цель: Использование Map + кастомный компаратор.

 */