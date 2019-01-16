package week9Streem.exe1And2StreamPractice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamsApplicationTest {

    private FileReader reader = new FileReader();
    private List<String> names=reader.asLine("week9Streem/exe1And2StreamPractice/names.txt");

    @Test
    void testShorter() {

        List<String> shortNames = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected= Arrays.asList("El");
        assertEquals(expected,shortNames);
    }


    @Test
    void testM() {

        List<String> mNames = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e-> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected= Arrays.asList("HOSAM","TAMMAM");
        assertEquals(expected,mNames);
    }
    @Test
    void testRE() {

        List<String> reNames = names.stream()
                .filter(e -> e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        assertEquals(expected, reNames);

    }

        @Test
        void testFourChar() {

            List<String> fourNames = names.stream()
                    .filter(e -> e.length() == 4)
                    .map(e-> e.toLowerCase())
                    .filter(e-> e.contains("a") && e.contains("m"))
                    .map(e-> e.replaceAll("a","aa"))
                    .collect(Collectors.toList());
            List<String> expected= Arrays.asList("maarj", "aamin", "omaar");
            assertEquals(expected,fourNames);
        }





}