package week11Time.reflectionWeek11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SolsticeMessenger {
    private SolsticeCalculator solsticesCalculator = new SolsticeCalculator();
    private SolsticesCountDown solsticesCountDown = new SolsticesCountDown();
    private LocalDate today;
    private LocalDate exceptionalDate = today.plusYears(1);


    public SolsticeMessenger(String todayDate) {
        this.today = LocalDate.parse(todayDate, DateTimeFormatter.ofPattern("MMM dd yyyy"));
    }

    public String disPlayTheSolsticesInformation() {
        LocalDate summerSolsticeOfThisYear = solsticesCalculator.findSummerSolstice(today.getYear());
        LocalDate winterSolsticeOfThisYear = solsticesCalculator.findWinterSolstice(today.getYear());

        if (today.isBefore(summerSolsticeOfThisYear) &&
                today.isBefore(winterSolsticeOfThisYear)) {
            return solsticesCountDown.getSummerSolstice(today) +
                    solsticesCountDown.getWinterSolstice(today);
        }

        if (today.isAfter(summerSolsticeOfThisYear) &&
                today.isBefore(winterSolsticeOfThisYear)) {
            return solsticesCountDown.getSummerSolstice(exceptionalDate) +
                    solsticesCountDown.getWinterSolstice(today);
        }

        return solsticesCountDown.getSummerSolstice(exceptionalDate) +
                solsticesCountDown.getWinterSolstice(exceptionalDate);
    }
}
