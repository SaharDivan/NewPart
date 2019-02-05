package heroQuestBoard.reailFenceCipher.GroupSolution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CipherMapTest {

    @Test
    void makeCipherMap() {

        CipherMap cipherMap = new CipherMap();
        List<Coordinate> list = Arrays.asList(
                new Coordinate(0,0),
                new Coordinate(0,1));

        String actual = (String) cipherMap.Encrypt(list, "saharsahebdivan");

        assertEquals("", actual);


    }
}