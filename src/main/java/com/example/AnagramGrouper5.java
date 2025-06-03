package com.example;
import java.util.*;


public class AnagramGrouper5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            anagramMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        List<List<String>> result = new ArrayList<>(anagramMap.values());
        System.out.println(result);
    }
}
/*
5. Группировка анаграмм
        Условие:Группировать слова, которые являются анаграммами, в списки.
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
// Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
        Цель: Создание ключа по отсортированной строке, использование Map<String, List<String>>.
 */