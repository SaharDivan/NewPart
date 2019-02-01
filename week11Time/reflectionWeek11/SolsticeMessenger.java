package week11Time.reflectionWeek11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SolsticeMessenger {
    private SolsticesCountDown solsticesCountDown = new SolsticesCountDown();
    private LocalDate today;

    public SolsticeMessenger(String todayDate) {
        this.today = LocalDate.parse(todayDate, DateTimeFormatter.ofPattern("MMM dd yyyy"));
    }

    public String disPlayTheSolsticesInformation(){
       return solsticesCountDown.getSummerSolstice(today) +
        solsticesCountDown.getWinterSolstice(today);
    }


}
