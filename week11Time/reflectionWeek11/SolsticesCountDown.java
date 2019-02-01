package week11Time.reflectionWeek11;

import java.time.LocalDate;
import java.util.Map;

public class SolsticesCountDown {
    private CountDownCalculator countDown = new CountDownCalculator();
    private Map<Integer, LocalDate> dataSummer = new SolsticeData().getSummerSolsticeDate();
    private Map<Integer, LocalDate> dataWinter = new SolsticeData().getWinterSolsticeDate();

    public String getSummerSolstice(LocalDate today) {
        Integer yearReference = today.getYear();
        LocalDate solsticeDate = dataSummer.get(yearReference);
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
        LocalDate solsticeDate = dataWinter.get(yearReference);
        Long remainsInDays = countDown.calculate(today, solsticeDate);
        return "The Winter Solstice " + today.getYear() + " is on " +
                solsticeDate.getDayOfWeek() + ", " +
                solsticeDate.getMonth() +" "+
                solsticeDate.getDayOfMonth() + ", " +
                today.getYear()+ " (in " +
                remainsInDays + " days). ";


    }
}
