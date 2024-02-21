package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void task4() {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){
            list.add(i);
        }
        List<Integer> listOfEvenNumbers = new ArrayList<>();
        list.stream().filter((number)->number % 2 == 0).forEach(listOfEvenNumbers::add);
        System.out.println(listOfEvenNumbers);
    }

    public static void task5() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> wordsStartsWithC = myList.stream()
                .filter(word->word.startsWith("c"))
                .map(String::toUpperCase)
                .sorted((s1,s2)-> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println(wordsStartsWithC);
    }
}


