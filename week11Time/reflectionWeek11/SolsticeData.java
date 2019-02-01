package week11Time.reflectionWeek11;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class SolsticeData {


    Map<Integer, LocalDate> getSummerSolsticeDate() {

        Map<Integer, LocalDate> dataSummer = new HashMap<>();

        dataSummer.put(2014, LocalDate.parse("Jun 21 2014", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2015, LocalDate.parse("Jun 21 2015", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2016, LocalDate.parse("Jun 20 2016", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2017, LocalDate.parse("Jun 21 2017", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2018, LocalDate.parse("Jun 21 2018", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2019, LocalDate.parse("Jun 21 2019", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2020, LocalDate.parse("Jun 20 2020", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2021, LocalDate.parse("Jun 21 2021", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2022, LocalDate.parse("Jun 21 2022", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2023, LocalDate.parse("Jun 21 2023", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataSummer.put(2024, LocalDate.parse("Jun 24 2024", DateTimeFormatter.ofPattern("MMM dd yyyy")));

        return dataSummer;
    }

    Map<Integer, LocalDate> getWinterSolsticeDate() {

        Map<Integer, LocalDate> dataWinter = new HashMap<>();

        dataWinter.put(2014, LocalDate.parse("Dec 21 2014", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2015, LocalDate.parse("Dec 22 2015", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2016, LocalDate.parse("Dec 20 2016", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2017, LocalDate.parse("Dec 21 2017", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2018, LocalDate.parse("Dec 21 2018", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2019, LocalDate.parse("Dec 22 2019", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2020, LocalDate.parse("Dec 20 2020", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2021, LocalDate.parse("Dec 21 2021", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2022, LocalDate.parse("Dec 21 2022", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2023, LocalDate.parse("Dec 22 2023", DateTimeFormatter.ofPattern("MMM dd yyyy")));
        dataWinter.put(2024, LocalDate.parse("Dec 24 2024", DateTimeFormatter.ofPattern("MMM dd yyyy")));

        return dataWinter;
    }
}
