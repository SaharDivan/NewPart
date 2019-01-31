package week11Time.exe3Clock.sectionOfDay;

public class AfterNoon extends TimeOfDay {

    public AfterNoon(String start, String end) {
        super(start, end);
    }

    @Override
    public String saySectionOfDay(Integer hour, Integer minute) {
        System.out.println(", in the afternoon. ");
        return "Afternoon";
    }
}
