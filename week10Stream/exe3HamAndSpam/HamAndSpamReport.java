package week10Stream.exe3HamAndSpam;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class HamAndSpamReport {

    private ReadDialogue dialogueReader = new ReadDialogue();
       private List<Dialogue> dialogues= dialogueReader.getDialogues();


    List<String> getTheRatio() {
        System.out.println(" \n Which is the ratio between ham and spam sorted by highest first?");
        long count = dialogues.stream()
                .count();
        Map<String, Long> percentage = dialogues.stream()
                .collect(groupingBy(Dialogue::getCharacter, counting()));
        List<String> ratio = percentage.entrySet().stream()
                .map(entry -> entry.getKey() + " | " + entry.getValue() * 100 / count + "%")
                .collect(Collectors.toList());
        //.forEach(e -> System.out.println(e));
        System.out.println(ratio);
        return ratio;
    }

    List<String> getMostUsedWordByHam(){
        System.out.println(" \n Which one is the most used word in ham?");
        Map<String, Long> hamWords = dialogues.stream()
                .filter(e -> e.getCharacter().equalsIgnoreCase("ham"))
                .map(e -> e.getSentence().split(" "))
                .flatMap(Stream::of)
                .collect(groupingBy(e->e,counting()));
        List<String> usedWords = hamWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey() + " | appears " + e.getValue() + " times")
                .collect(Collectors.toList());
        System.out.println(usedWords);
        return usedWords;
    }

    List<String> getTheMostUsedLetterByHam(){
        System.out.println(" \n Which one is the most used letter in ham?");
        Map<String, Long> letters = dialogues.stream()
                .filter(e -> e.getCharacter().equalsIgnoreCase("ham"))
                .map(e -> e.getSentence().split(" "))
                .flatMap(Stream::of)
                .map(e -> e.replaceAll("!", ""))
                .map(e -> e.replaceAll("\\.", ""))
                .map(e -> e.replaceAll(" ", ""))
                .map(e -> e.replaceAll(":", ""))
                .map(e -> e.replaceAll("\\?", ""))
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(groupingBy(e -> e, counting()));
        List<String> usedLetters = letters.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey() + " | is used " + e.getValue() + " times")
                .collect(Collectors.toList());
        System.out.println(usedLetters);
        return usedLetters;

    }

    Set<Integer> getTheLongestSpamMessage(){
        System.out.println("\n How long is the longest spam message?");

        Map<Integer, List<String>> spamSentences = dialogues.stream()
                .filter(e -> e.getCharacter().equalsIgnoreCase("spam"))
                .map(e -> e.getSentence())
                .collect(groupingBy(String::length));
        Set<Integer> set = spamSentences.entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .limit(1)
                .map(e -> e.getKey())
                .collect(Collectors.toSet());
        System.out.println(set);
        return set;
    }
}
