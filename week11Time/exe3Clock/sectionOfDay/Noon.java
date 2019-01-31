package week11Time.exe3Clock.sectionOfDay;

public class Noon extends TimeOfDay {

    public Noon(String start, String end) {
        super(start, end);
    }

    @Override
    public String saySectionOfDay(Integer hour, Integer minute) {
        System.out.println(" It's Noon! ");
        return "Noon";
    }
}
