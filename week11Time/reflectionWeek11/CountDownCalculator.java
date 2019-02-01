package week11Time.reflectionWeek11;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CountDownCalculator {
    public Long calculate(LocalDate now, LocalDate then) {
        return ChronoUnit.DAYS.between(now,then);
    }
}
