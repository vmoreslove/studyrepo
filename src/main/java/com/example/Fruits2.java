package com.example;
import java.util.*;

    public class Fruits2 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
            Map<String, Integer> wordCount = new LinkedHashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            //for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            //System.out.println(entry.getKey() + "= " + entry.getValue());
            System.out.println(wordCount);
        }
}
/*
2. Подсчёт частоты слов
Условие:По списку слов составьте словарь, где ключ — слово, а значение — количество его вхождений.
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
// Output: {apple=2, banana=3, orange=1}
Цель: Работа с Map, HashMap.
 */