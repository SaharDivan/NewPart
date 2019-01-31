package week11Time.exe3Clock;

import java.util.Map;

public class Transformer {

    private ClockLibrary clockLibrary = new ClockLibrary();
    private  Map<Integer,String> numInWords = clockLibrary.makeTheLibrary();

   String toWord(Integer num){
       //range between 1-30
       if(num <= 20){
           return numInWords.get(num);
       }
       String[] key = num.toString().split("");
       return  numInWords.get(Integer.valueOf(key[0])*10)
               + numInWords.get(Integer.valueOf(key[1]));
   }



}
