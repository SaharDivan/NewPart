package week11Time.exe4Edits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvaluatorTest {

    @Test
    void isOneEditingStepAwayTrueCase() {
        Evaluator evaluator = new Evaluator();
        List<String> expectedTrue = Arrays.asList("sahdr,sadr", "abc,abcd", "sahar,saar", "saar,sahar");
        expectedTrue.forEach(s -> {
            Boolean actual = evaluator.isEitherOneOrZeroStepAway(s.split(",")[0], s.split(",")[1]);
            assertTrue(actual);
        });
    }

    @Test
    void isOneEditingStepAwayFalseCase() {
        Evaluator evaluator = new Evaluator();
        List<String> expectedFalse = Arrays.asList("abcde,bbcd", "abcd,bbc", "mahmoo,sahar", "mahmood,sara");
        expectedFalse.forEach(s -> {
            Boolean actual = evaluator.isEitherOneOrZeroStepAway(s.split(",")[0], s.split(",")[1]);
            assertFalse(actual);
        });
    }
}