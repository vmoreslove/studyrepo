package com.example;

import java.util.*;

public class FrequencyQueue6 {

    private final Map<String, Integer> frequencyMap = new HashMap<>();
    private final PriorityQueue<String> maxHeap;

    public FrequencyQueue6() {
        // PriorityQueue с компаратором по убыванию частоты, затем по алфавиту
        this.maxHeap = new PriorityQueue<>((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            return freqCompare != 0 ? freqCompare : a.compareTo(b);
        });
    }

    public void add(String element) {
        frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        maxHeap.remove(element); // Удаляем, чтобы обновить позицию в очереди
        maxHeap.add(element);    // Добавляем заново с обновлённой частотой
    }

    public String getMostFrequent() {
        return maxHeap.peek(); // Возвращает элемент с максимальной частотой (не удаляет)
    }

    // Дополнительно: удаление элемента с максимальной частотой
    public String pollMostFrequent() {
        String top = maxHeap.poll();
        if (top != null) {
            frequencyMap.remove(top);
        }
        return top;
    }
    // Для теста
    public static void main(String[] args) {
        FrequencyQueue6 fq = new FrequencyQueue6();
        fq.add("apple");
        fq.add("banana");
        fq.add("apple");
        fq.add("orange");
        fq.add("orange");
        fq.add("orange");

        System.out.println("Most frequent: " + fq.getMostFrequent()); // banana
    }
}

/*
6. Очередь с приоритетом по частоте
Условие Реализовать структуру, в которую можно добавлять элементы, и которая при извлечении возвращает элемент с максимальной частотой в коллекции.
Методы:
void add(String element):
String getMostFrequent();
Цель: Работа с PriorityQueue, HashMap, возможно создание своего Comparator.
 */