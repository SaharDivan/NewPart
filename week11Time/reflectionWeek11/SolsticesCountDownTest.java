package week11Time.reflectionWeek11;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class SolsticesCountDownTest {

    @Test
    void getSummerSolstice() {
        SolsticesCountDown solsticesCountDown = new SolsticesCountDown();
        LocalDate testDate = LocalDate.parse("Feb 01 2019", DateTimeFormatter.ofPattern("MMM dd yyyy"));
        String actual = solsticesCountDown.getSummerSolstice(testDate);

        assertEquals("The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 140 days). ",actual);
    }

    @Test
    void getWinterSolstice() {

        SolsticesCountDown solsticesCountDown = new SolsticesCountDown();
        LocalDate testDate = LocalDate.parse("Feb 01 2019", DateTimeFormatter.ofPattern("MMM dd yyyy"));
        String actual = solsticesCountDown.getWinterSolstice(testDate);

        assertEquals("The Winter Solstice 2019 is on SUNDAY, DECEMBER 22, 2019 (in 324 days). ",actual);
    }
}