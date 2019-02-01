package week11Time.exe3Clock;

import week11Time.exe3Clock.sectionOfDay.*;

import java.util.Arrays;
import java.util.List;

public class TimeAnnouncer {


    private List<TimeOfDay> sectionsOfDay = Arrays.asList(
            new Morning("06:00","11:59"),
            new Morning("06:00","11:59"),
            new Morning("06:00","11:59"),
            new Morning("06:00","11:59"),
            new Night  ("20:01","05:59"),
            new MidNight("00:00","00:00")
    );

   public String tellTheTimeOfDay(Integer hour, Integer minute){
        String time="";

       for (TimeOfDay section:sectionsOfDay) {
           if(section.isInTheInterval(hour,minute)){
               time = section.announceTheTime(hour, minute);
           }
       }
        return time;
    }
}
