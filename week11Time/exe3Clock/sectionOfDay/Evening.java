package week11Time.exe3Clock.sectionOfDay;

public class Evening extends TimeOfDay {

    public Evening(String start, String end) {
        super(start, end);
    }

    @Override
    public String saySectionOfDay(Integer hour, Integer minute) {
        System.out.println(", in the evening. ");
        return "Evening";
    }
}
