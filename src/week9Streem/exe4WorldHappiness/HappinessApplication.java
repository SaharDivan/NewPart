package week9Streem.exe4WorldHappiness;

import java.util.Comparator;

public class HappinessApplication {

    public static void main(String[] args) {

        new FileReader().asStream("week9Streem/exe4WorldHappiness/world-happiness-2017.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new HappinessRecord(e[0], Integer.valueOf(e[1]), e[2]))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(e -> System.out.println(e));
    }
}
