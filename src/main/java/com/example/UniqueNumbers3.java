package com.example;
import java.util.*;


public class UniqueNumbers3 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);
            Map<Integer, Integer> countNumbers = new LinkedHashMap<>();

            for (Integer number : numbers) {
                countNumbers.put(number, countNumbers.getOrDefault(number, 0) + 1);
            }
            for (Integer number : countNumbers.keySet()) {
                if (countNumbers.get(number)==1) {
                    System.out.println(number);
                    break;
                }
            }
        }
}
/*
3. Найти первый неповторяющийся элемент
Условие Дан список целых чисел. Найдите первый элемент, который не повторяется.
List<Integer> numbers = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2):
// Output: 1
Цель: Умение комбинировать Map, Set, List.
 */