package week9Streem.exe5FilmSummerize;

import week9Streem.exe4WorldHappiness.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    private FileReader reader = new FileReader();

    public List<Film> getFilms(){
        List<Film> filmList = reader.asStream("week9Streem/exe5FilmSummerize/films.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Film(Long.valueOf(e[0]), Long.valueOf(e[5]), Integer.valueOf(e[6]), e[8], Double.valueOf(e[9]), Integer.valueOf(e[10])))
                .collect(Collectors.toList());
            return  filmList;
    }



}
