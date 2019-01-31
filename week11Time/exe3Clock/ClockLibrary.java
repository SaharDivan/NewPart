package week11Time.exe3Clock;

import java.util.Hashtable;
import java.util.Map;

 class ClockLibrary {

    Map<Integer, String> makeTheLibrary(){
        Map<Integer, String> numsInWords= new Hashtable<>();
        numsInWords.put(0,"");
        numsInWords.put(1,"one");
        numsInWords.put(2,"two");
        numsInWords.put(3,"three");
        numsInWords.put(4,"four");
        numsInWords.put(5,"five");
        numsInWords.put(6,"six");
        numsInWords.put(7,"seven");
        numsInWords.put(8,"eight");
        numsInWords.put(9,"nine");
        numsInWords.put(10,"ten");
        numsInWords.put(11,"eleven");
        numsInWords.put(12,"twelve");
        numsInWords.put(13,"thirteen");
        numsInWords.put(14,"fourteen");
        numsInWords.put(15,"fifteen");
        numsInWords.put(16,"sixteen");
        numsInWords.put(17,"seventeen");
        numsInWords.put(18,"eighteen");
        numsInWords.put(19,"nineteen");
        numsInWords.put(20,"twenty");
        numsInWords.put(30,"thirty");
        
        return numsInWords;
    }
}
