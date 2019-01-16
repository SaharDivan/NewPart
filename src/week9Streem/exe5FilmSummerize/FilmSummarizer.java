package week9Streem.exe5FilmSummerize;

import java.util.Comparator;
import java.util.List;

public class FilmSummarizer {

        private FilmReader filmReader = new FilmReader();
        List<Film> filmList=filmReader.getFilms();


        void getTopScores(){
            System.out.println("\n\n\t ----Top 3 with highest rating, sorted by rating: --- ");
            filmList.stream()
                    .sorted(Comparator.comparing(Film::getScore).reversed())
                    .limit(3)
                    .forEach(e-> System.out.print("\""+e.getTitle()+"\""+", "));


        }

        void getTopScoresLong(){
            System.out.println("\n\n\t ---Top 3 with highest rating longer than 3 hours, sorted by rating: ---");
            filmList.stream()
                    .filter(e-> e.getRunTime()>180)
                    .sorted(Comparator.comparing(Film::getScore).reversed())
                    .limit(3)
                    .forEach(e-> System.out.print("\""+e.getTitle()+"\""+", "));
        }

        void getTopExpensive(){
            System.out.println("\n\n\t ---Top 4 most expensive, sorted by budget: ---");
            filmList.stream()
                    .sorted(Comparator.comparing(Film::getBudget).reversed())
                    .limit(4)
                    .forEach(e-> System.out.print("\""+e.getTitle()+"\""+", "));

        }

        void getTopExpensiveShort(){
            System.out.println("\n\n\t ---Top 4 most expensive shorter than 90 minutes, sorted by budget: --- ");
            filmList.stream()
                    .filter(e-> e.getRunTime()<90)
                    .sorted(Comparator.comparing(Film::getBudget).reversed())
                    .limit(4)
                    .forEach(e-> System.out.print("\""+e.getTitle()+"\""+", "));

        }



        void getTopRatedWithBudget(){
            System.out.println("\n\n\t ---Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget: ---");
            filmList.stream()
                    .filter(e-> e.getScore()>7
                             && e.getRevenue()<500.000
                             && e.getBudget()> 50.000)
                    .sorted(Comparator.comparing(Film::getScore).reversed())
                    .limit(4)
                    .forEach(e-> System.out.print( "\""+e.getTitle()+"\""+", "));
        }
}
