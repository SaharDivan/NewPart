package week11Time.exe3Clock;

import week11Time.exe3Clock.sectionOfDay.*;

public class TimeAnnouncer {

    private TimeOfDay morning = new Morning("06:00","11:59");
    private TimeOfDay noon  = new Noon("12:00","12:00");
    private TimeOfDay afterNoon = new AfterNoon("12:01","17:00");
    private TimeOfDay evening = new Evening("17:01","20:00");
    private Night night = new Night("20:01","05:59");
    private MidNight midNight = new MidNight("00:00","00:00");


   public String tellTheTimeOfDay(Integer hour, Integer minute){
        String time="";

        if( morning.checkTheValidInterval(hour,minute) ){
             time = morning.announceTheTime(hour, minute);
        }
        if(noon.checkTheValidInterval(hour,minute)){
             time = noon.saySectionOfDay(hour, minute);
        }
        if(afterNoon.checkTheValidInterval(hour,minute)){
            time = afterNoon.announceTheTime(hour, minute);
        }

        if(evening.checkTheValidInterval(hour,minute)){
            time = evening.announceTheTime(hour, minute);
        }

        if(night.checkTheValidInterval(hour,minute)){
             time = night.announceTheTime(hour, minute);
        }
        if(midNight.checkTheValidInterval(hour,minute)){
             time = midNight.saySectionOfDay(hour, minute);
        }
        return time;
    }
}
