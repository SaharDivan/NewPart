package heroQuestBoard.reailFenceCipher;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class encryptor {

   public String encrypt(String planText, Integer rails) {
       String cipheredText = "";
       String collect;
        int a = 0;

       while (a < rails) {
           List<String> text = prepareTheText(planText);
           for (int i = 0; i < text.size(); i++) {
               if (i % rails != a) {
                   text.remove(i);
               }
           }
            collect = text.stream()
                   .collect(Collectors.joining());
           cipheredText = cipheredText + collect;
           a++;
       }
       return cipheredText;
   }


    private List<String> prepareTheText(String planText) {
        String trimedText = planText.replace(" ", "").trim();
        return Stream.of(trimedText.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }

}
