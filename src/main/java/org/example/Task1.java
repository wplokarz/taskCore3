package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Task1 {

    public static void task1() {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);
    }

    public static void task2() {
        List<Integer> listOfRandomNumbers = Stream.generate(() -> new Random().nextInt()).limit(20).collect(Collectors.toList());
        System.out.println(listOfRandomNumbers);
    }

    public static void task3() {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){
            list.add(i);
        }
        List<Integer> listOfEvenNumbers = list.stream().filter((number)->number % 2 == 0).collect(Collectors.toList());
        System.out.println(listOfEvenNumbers);
    }

}
