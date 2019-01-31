package week11Time.exe3Clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeAnnouncerTest {

    @Test
    void tellTheTimeOfDay() {

        TimeAnnouncer timeAnnouncer = new TimeAnnouncer();
        String[] split = timeAnnouncer.tellTheTimeOfDay(23, 8).split(";");
        System.out.println(split[1]);
        String actual = split[0];
        String expected = " at night. ";
        assertEquals(expected, split[1]);


    }
}