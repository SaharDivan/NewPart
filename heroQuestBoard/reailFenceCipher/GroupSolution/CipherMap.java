package heroQuestBoard.reailFenceCipher.GroupSolution;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CipherMap {



    public String Encrypt(List<Coordinate> cipherCoordinate, String plainText) {
        Map<Coordinate, String> cipherMap = makeCipherMap(cipherCoordinate, plainText);
        return cipherMap.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getKey().getRow()))
                .map(e -> e.getValue())
                .collect(joining());

    }


    public Map<Coordinate,String> makeCipherMap(List<Coordinate> cipherCoordinate, String plainText){
        Map<Coordinate, String> cipherMap = new HashMap<>();
        List<String> plainList = getPlainList(plainText);
        for (Coordinate coordinate:cipherCoordinate) {
            cipherMap.put(coordinate,plainList.get(0));
            plainList.remove(0);
        }
        return cipherMap;
    }



    private List<String> getPlainList(String plainText) {
        return Stream.of(plainText.split(""))
                .collect(toList());
    }
}
