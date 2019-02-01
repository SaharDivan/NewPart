package week11Time.reflectionWeek11;

import java.time.LocalDate;

public class SolsticesCountDown {
    private CountDownCalculator countDown = new CountDownCalculator();
    private SolsticeCalculator calculator = new SolsticeCalculator();

    public String getSummerSolstice(LocalDate today) {
        Integer yearReference = today.getYear();
        LocalDate solsticeDate = calculator.findSummerSolstice(yearReference);
        Long remainsInDays = countDown.calculate(today, solsticeDate);
        return "The Summer Solstice " + today.getYear() + " is on " +
                solsticeDate.getDayOfWeek() + ", " +
                solsticeDate.getMonth() +" "+
                solsticeDate.getDayOfMonth() + ", " +
                today.getYear()+ " (in " +
                remainsInDays + " days). ";

    }

    public String getWinterSolstice(LocalDate today) {
        Integer yearReference = today.getYear();
        LocalDate solsticeDate = calculator.findWinterSolstice(yearReference);
        Long remainsInDays = countDown.calculate(today, solsticeDate);
        return "The Winter Solstice " + today.getYear() + " is on " +
                solsticeDate.getDayOfWeek() + ", " +
                solsticeDate.getMonth() +" "+
                solsticeDate.getDayOfMonth() + ", " +
                today.getYear()+ " (in " +
                remainsInDays + " days). ";


    }
}
