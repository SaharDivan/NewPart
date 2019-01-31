package week11Time.exe3Clock.sectionOfDay;

import java.time.LocalTime;

public class Night extends TimeOfDay {

    public Night(String start, String end) {
        super(start, end);
    }

    @Override
    public String saySectionOfDay(Integer hour, Integer minute) {
        System.out.println("; at night. ");
        return "Night";
    }

    public Boolean checkTheValidInterval(Integer hour, Integer minute) {
        LocalTime time = LocalTime.of(hour, minute);
        LocalTime exception = LocalTime.of(0, 0);

        return (time.isAfter(start) && !time.equals(exception))||
                (time.isBefore(end) && !time.equals(exception)) ||
                time.equals(start) ||
                time.equals(end);
    }


}