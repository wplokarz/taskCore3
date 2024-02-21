package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {

    public static void task14() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));
        List<List<String>> combinatedList = people.entrySet().stream().map(value->value.getValue()).collect(Collectors.toList());
        List<String> listWithLettersOnly = combinatedList.stream().flatMap(Collection::stream).filter(word->word.matches("[A-z]")).collect(Collectors.toList());
        System.out.println(listWithLettersOnly);
    }

}
