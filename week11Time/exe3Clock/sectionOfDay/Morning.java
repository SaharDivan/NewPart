package week11Time.exe3Clock.sectionOfDay;

public class Morning extends TimeOfDay {

    public Morning(String start, String end) {
        super(start, end);
    }

    @Override
    public String saySectionOfDay(Integer hour, Integer minute) {
        System.out.println(", in the morning. ");
        return "Morning";
    }

}
