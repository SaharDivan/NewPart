package week9Streem.exe1And2StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {


    public static void main(String[] args) {


        List<Integer> numbers= new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            numbers.add(i+1);
        }
        System.out.println(numbers);


        //first even numbers
        System.out.println("\n\t---even numbers: ");
        List<Integer> expected= Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        List<Integer> collect0 = numbers.stream()
                .filter(e-> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect0);

        //odd Numbers:
        System.out.println("\n\t---Odd numbers: ");
        List<Integer> collect1 = numbers.stream()
                .filter(e -> e % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(collect1);


        //Divisive by 3 & bigger than 10:
        System.out.println("\n\t---Divisive by 3 & bigger than 10: ");
        List<Integer> collect2 = numbers.stream()
                .filter(e -> e % 3 == 0 && e > 10)
                .collect(Collectors.toList());
        System.out.println(collect2);

        //Smaller than 5 && multiple by 3:
        System.out.println("\n\t ---Smaller than 5 && multiple by 3:");
        List<Integer> collect3 = numbers.stream().
                filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println(collect3);

        //Digits of numbers bigger than 8 and smaller than 12:
        System.out.println("\n\t ---Digits of numbers bigger than 8 and smaller than 12: ");
        List<String> collect4 = numbers.stream()
                .filter(e -> e < 12 && e > 8)
                .map(Object::toString)
                .map(e->"Number " + e +" has "+ e.length()+ " digits")
                .collect(Collectors.toList());
        System.out.println(collect4);

    }
}
