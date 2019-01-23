package week10Stream.sdudentPerformence;

import week9Stream.exe4WorldHappiness.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentData {

    private FileReader reader = new FileReader();
    private List<String> file = reader.asList("week10Stream/sdudentPerformence/students-performance.csv");

    public List<Student> getStudentData(){
        List<Student> studentProfile = file.stream()
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Student(e[0],e[1],Integer.valueOf(e[2]),Integer.valueOf(e[3]),Integer.valueOf(e[4])))
                .collect(Collectors.toList());
        return studentProfile;

    }
}
