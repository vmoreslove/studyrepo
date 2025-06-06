package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> personMap = new HashMap();
        //personMap.put("Petya",18);
        //personMap.put("Dima",19);
        //System.out.println(personMap);
        Person p1 = new Person(16, "Vasya");
        Person p2 = new Person(16, "Vasya");
        Student s3 = new Student(16,"Mitya",5);
        Student s4 = new Student(16,"Mitya",5);

        //System.out.println(p1.getName());
        //System.out.println(p1.getAge());
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(s3.equals(s4));
        //System.out.println(p1.toString());
    }

}




