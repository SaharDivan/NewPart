package week9Streem.exe3CaesarCipher;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public String cipher(String plaintext, Integer key){
        return Stream.of(plaintext.split(""))
                .map(e-> e.charAt(0))
                .map(e -> shift(e,key))
                .map(e -> e.toString())
                .collect(Collectors.joining());
    }


    private Character shift(Character letter, int key) {
        if(!Character.isAlphabetic(letter)){
            return letter;
        }
        if((int)letter>63 && (int)letter<90) {
            return (char) (((int) letter - (int) 'A' + key) % 26 + (int) 'A');
        }
        return (char)(((int)letter-(int)'a' + key) % 26 + (int)'a');
    }
}
