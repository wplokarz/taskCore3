package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public static void task11() {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<Integer> combinedList = Stream.of(list1, list2, list3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(combinedList);
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        List<String> combinedArray = Stream.of(dataArray).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(combinedArray);
    }

    public static void task12() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        ArrayList<Integer> distinctNumbers = numbersList.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(distinctNumbers);
    }

    public static void task13() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        Map<Integer, Long> howManyNumberAppears = numbersList.stream().collect(Collectors.groupingBy(number->number, Collectors.counting()));
        System.out.println(howManyNumberAppears);
    }
}
