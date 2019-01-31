package week11Time.exe3Clock.sectionOfDay;

import java.time.LocalTime;

public class MidNight extends TimeOfDay {

    public MidNight(String start, String end) {
        super(start, end);
    }

    @Override
    public String saySectionOfDay(Integer hour, Integer minute) {
        System.out.print("It's midnight! ");
        return "Midnight";
    }

    public Boolean checkTheValidInterval(Integer hour, Integer minute) {
        LocalTime time = LocalTime.of(hour, minute);
        return time.equals(start) ||
                time.equals(end);
    }
}
