package week10Stream.week10Reflection;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class BookStaticApplication {
    public static void main(String[] args) {


        BookReader bookReader = new BookReader();
        List<String> bookWords = bookReader.cleanTheText();

        long numberOfWords = bookWords.stream()
                .count();
        System.out.println("Total number of Words | " + numberOfWords);

        long numberOfDistinctWords = bookWords.stream()
                .distinct()
                .count();
        System.out.println("Total number of distinct words | " + numberOfDistinctWords);


        bookWords.stream()
                .distinct()
                .collect(groupingBy(String::length))
                .entrySet().stream()
                .sorted(comparing(Map.Entry::getKey))
                .limit(1)
                .forEach(e -> System.out.println(e.getValue()));

        bookWords.stream()
                .map(e -> e.trim())
                .collect(groupingBy(e -> e, counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));



    }



}
