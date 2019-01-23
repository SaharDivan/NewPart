package week10Stream.sdudentPerformence;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentStatistic {

     void getParentalStatisticOnEdu(List<Student> studentsProfile) {
         System.out.println("\n\n ---How many times does each parent level of education appear?");
         studentsProfile.stream()
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation))
                .entrySet().stream()
                .forEach(e -> System.out.println(e.getKey()+ " | "+ e.getValue().size()+" Times"));
    }

    void getParentalStatisticOnEduOrdered(List<Student> studentsProfile) {
         System.out.println("\n ---How many times does each parent level of education appear?");
         studentsProfile.stream()
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()) )
                .forEach(e -> System.out.println(e.getKey()+ " | "+ e.getValue()+" Times"));
    }


     void getStudentsWithParentMasterAndLowDegree(List<Student> studentsProfile) {
         System.out.println("\n ---How many students have parents with a master’s degree and lower grades than 60 on each topic?\n");
         long studentStatistic = studentsProfile.stream()
                 .filter(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("master's degree"))
                 .filter(e -> e.getMathScore() < 60
                         && e.getReadingScore() < 60
                         && e.getWritingScore() < 60)
                 .count();
         System.out.println(studentStatistic);
     }


     void getTopThreeHighest(List<Student> studentsProfile){
             System.out.println("\n ---Which genders and average scores do the three students with the highest average score have?\n");
             studentsProfile.stream()
                     .peek(e -> e.setAverage(getAverage(e)))
                     .sorted(Comparator.comparing(Student::getAverage).reversed())
                     .limit(4)
                     .forEach(e-> System.out.println("A "+e.getGender()+" with average score of: "+ e.getAverage()));
         }


    void getStudentWithHighScoreAndHighSchoolLevelParent(List<Student> studentsProfile){
        System.out.println("\n ---Is there any student with a parent education level of some high school that has at least 95 in every topic?\n");
        boolean anyMatchForHighScoreAndParentalEduLevel = studentsProfile.stream()
                .filter(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("some high school"))
                .anyMatch(e -> e.getReadingScore() >= 95
                        && e.getWritingScore() >= 95
                        && e.getMathScore() >= 95);
        System.out.println(anyMatchForHighScoreAndParentalEduLevel);

    }


    private Double getAverage(Student e) {
         return IntStream.of(e.getMathScore(),e.getReadingScore(),e.getWritingScore())
                 .average().getAsDouble();
     }


}
