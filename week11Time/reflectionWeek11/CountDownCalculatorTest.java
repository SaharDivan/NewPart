package week11Time.reflectionWeek11;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CountDownCalculatorTest {

    @Test
    void calculate() {
        CountDownCalculator calculator =new CountDownCalculator();
        LocalDate now = LocalDate.parse("Feb 01 2019", DateTimeFormatter.ofPattern("MMM dd yyyy"));
        LocalDate then = LocalDate.parse("Jun 21 2019", DateTimeFormatter.ofPattern("MMM dd yyyy"));
        Long actual = calculator.calculate(now, then);
        Long expected =140l ;
        assertEquals(expected, actual);
    }
}