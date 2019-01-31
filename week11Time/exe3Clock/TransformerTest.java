package week11Time.exe3Clock;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {

    @Test
    void toWordCase1() {
        Transformer trans = new Transformer();
        String actual = trans.toWord(25);
        String expected = "twentyfive";

        assertEquals(expected,actual);
    }


    @Test
    void toWordCase2() {
        Transformer trans = new Transformer();
        String actual = trans.toWord(30);
        String expected = "thirty";

        assertEquals(expected,actual);
    }

    @Test
    void toWordCase3() {
        Transformer trans = new Transformer();
        String actual = trans.toWord(35);
        String expected = "thirtyfive";

        assertEquals(expected,actual);
    }
}