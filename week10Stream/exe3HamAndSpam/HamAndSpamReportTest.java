package week10Stream.exe3HamAndSpam;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class HamAndSpamReportTest {


    private ReadDialogue dialogueReader = new ReadDialogue();
    private List<Dialogue> dialogues= dialogueReader.getDialogues();
    HamAndSpamReport report = new HamAndSpamReport();

    @Test
    void getTheRatio() {
        List<String> actual = report.getTheRatio();
        List<String> expected = Arrays.asList("ham | 86%","spam | 13%");
        assertEquals(expected,actual);
    }

    @Test
    void getMostUsedWordByHam() {

        List<String> actual = report.getMostUsedWordByHam();
        List<String> expected = Arrays.asList("to | appears 1531 times");
        assertEquals(expected,actual);
    }

    @Test
    void getTheMostUsedLetterByHam() {
        List<String> actual = report.getTheMostUsedLetterByHam();
        List<String> expected = Arrays.asList("e | is used 26364 times");
        assertEquals(expected,actual);
    }

    @Test
    void getTheLongestSpamMessage() {
        Set<Integer> actual = report.getTheLongestSpamMessage();
        Set<Integer> expected = new HashSet<>(Arrays.asList(224));
        assertEquals(expected,actual);
    }
}