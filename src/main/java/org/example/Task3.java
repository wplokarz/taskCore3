package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    private static List<String> namesOfUsers() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        return memberNames;
    }

    public static void task6() {
        List<String> memberNames = namesOfUsers();
        System.out.println("subtask A");
        List<String> namesStartsWithAAndWithAtLeastFiveCharacters = memberNames.stream().filter((word)-> word.startsWith("A") && word.length() > 5).collect(Collectors.toList());
        System.out.println(namesStartsWithAAndWithAtLeastFiveCharacters);
        System.out.println("subtask B");
        List<String> sortedNames = memberNames.stream().map(String::toLowerCase).sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedNames);
    }

    public static void task7() {
        List<String> memberNames = namesOfUsers();
        boolean allNamesContainLetterS = memberNames.stream().allMatch(name->name.contains("S"));
        boolean anyNamesContainLetterS = memberNames.stream().anyMatch(name->name.contains("S"));
        boolean noLetterHInName = memberNames.stream().noneMatch(name->name.contains("H"));
        System.out.println("Every name contains letter S:");
        System.out.println(allNamesContainLetterS);
        System.out.println("Any name contains letter S");
        System.out.println(anyNamesContainLetterS);
        System.out.println("Letter H in names:");
        System.out.println(noLetterHInName);
    }

    public static void task8() {
        List<String> memberNames = namesOfUsers();
        Long elementsInList = memberNames.stream().count();
        System.out.println(elementsInList);
    }

    public static void task9() {
        List<String> memberNames = namesOfUsers();
        Long numberOfNamesStartingWithA = memberNames.stream().filter(name->name.startsWith("A")).count();
        System.out.println(numberOfNamesStartingWithA);
    }

    public static void task10() {
        List<String> memberNames = namesOfUsers();
        memberNames.stream().filter(name->name.startsWith("L")).findFirst().ifPresent(System.out::println);
    }
}
