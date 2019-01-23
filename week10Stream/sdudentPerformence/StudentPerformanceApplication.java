package week10Stream.sdudentPerformence;

import java.util.List;

public class StudentPerformanceApplication {

    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        List<Student> studentsData = studentData.getStudentData();
        StudentStatistic statistic = new StudentStatistic();

        //----Students Statistic:------------
//        How many times does each parent level of education appear?
              statistic.getParentalStatisticOnEdu(studentsData);
//        Which are the different parent level of educations sorted from most appearing to least appearing?
              statistic.getParentalStatisticOnEduOrdered(studentsData);
//        How many students have parents with a master’s degree and lower grades than 60 on each topic?
             statistic.getStudentsWithParentMasterAndLowDegree(studentsData);
//        Which genders and average scores do the three students with the highest average score have?
                statistic.getTopThreeHighest(studentsData);
//        Is there any student with a parent education level of some high school that has at least 95 in every topic?
                statistic.getStudentWithHighScoreAndHighSchoolLevelParent(studentsData);


    }
}
