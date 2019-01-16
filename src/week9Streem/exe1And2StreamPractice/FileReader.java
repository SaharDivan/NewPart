package week9Streem.exe1And2StreamPractice;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {


    public List<String> asLine(String filepath){

        try {
            URI uri=ClassLoader.getSystemResource(filepath).toURI();
            Path path= Paths.get(uri);
            List<String> stringList = Files.readAllLines(path);

            return stringList;

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

            return new ArrayList<>();
    }

}
