package week11Time.exe3Clock.sectionOfDay;

import week11Time.exe3Clock.ClockReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class TimeOfDay {
    LocalTime start;
    LocalTime end;
    private ClockReader reader = new ClockReader();

    public TimeOfDay(String start, String end) {
        this.start = LocalTime.parse(start, DateTimeFormatter.ofPattern("HH:mm"));
        this.end = LocalTime.parse(end, DateTimeFormatter.ofPattern("HH:mm"));
    }

    public Boolean checkTheValidInterval(Integer hour, Integer minute) {
        LocalTime time = LocalTime.of(hour, minute);
        return (time.isAfter(start) && time.isBefore(end)) ||
                time.equals(start) ||
                time.equals(end);
    }

    public String announceTheTime(Integer hour, Integer minute) {
        return reader.sayTime(hour, minute) + saySectionOfDay(hour, minute);
    }


    public abstract String saySectionOfDay(Integer hour, Integer minute);

}

