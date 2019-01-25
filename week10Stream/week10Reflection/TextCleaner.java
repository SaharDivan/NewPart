package week10Stream.week10Reflection;

import week9Stream.exe4WorldHappiness.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BookReader {

    private FileReader reader = new FileReader();
    private List<String> bookLines= reader.asList("week10Stream/week10Reflection/alice.txt");

    public List<String> cleanTheText(){
        List<String> bookWords = bookLines.stream()
                .map(e -> e.toLowerCase())
                .map(e -> e.replaceAll("[:;#\\-,;'s\\'!?%@$\\/ \\_ ]", " "))
                .map(e -> e.replaceAll("[\\(\\)\\[\\]\\.\\*]", ""))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        return bookWords;
    }
}
