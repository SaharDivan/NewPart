package week11Time.exe3Clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockReaderTest {

    @Test
    void sayTime() {
        ClockReader reader = new ClockReader();
        String actual = reader.sayTime(3, 45);
        String expected = "fifteen minutes to four";

        assertEquals(expected,actual);
    }
}