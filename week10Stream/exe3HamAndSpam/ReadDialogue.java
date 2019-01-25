package week10Stream.exe3HamAndSpam;

import week9Stream.exe1And2StreamPractice.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class ReadDialogue {

    private FileReader reader = new FileReader();
    private List<String> sentences = reader.asLine("week10Stream/exe3HamAndSpam/sms.csv");


    List<Dialogue> getDialogues(){
        List<Dialogue> dialogues = sentences.stream()
                .skip(1)
                .map(s -> s.split(";"))
                .map(e -> new Dialogue(e[0], e[1]))
                .collect(Collectors.toList());
        return dialogues;
    }















}
