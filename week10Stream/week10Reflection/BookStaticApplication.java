package week10Stream.week10Reflection;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class BookStaticApplication {
    public static void main(String[] args) {


        BookReader bookReader = new BookReader();
        List<String> bookWords=bookReader.cleanTheText();

        long numberOfWords = bookWords.stream()
                .count();
        System.out.println("Total number of Words | "+ numberOfWords);

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
                .forEach(e-> System.out.println(e.getValue()));

         bookWords.stream()
                .collect(groupingBy(e -> e, counting()))
                .entrySet().stream()
                .limit(5)
                .forEach(e-> System.out.println(e.getValue()+e.getValue()));

    }



}
