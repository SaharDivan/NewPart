package week11Time.exe3Clock;

public class ClockReader {
    private Transformer trans = new Transformer();

     public String sayTime(Integer hour, Integer min){
        String answer = "";
        if(min == 0){
            answer =  trans.toWord(hour)+ " O'clock";
            System.out.print(answer);
        }
        if(min <= 30 && min != 0){
            answer= trans.toWord(min)+" minutes past "+ trans.toWord(hour);
            System.out.print(answer);
        }
        if(min > 30){
          Integer verbalMin = 60-min;
          Integer verbalHour = hour+1;
          answer= trans.toWord(verbalMin)+ " minutes to " + trans.toWord(verbalHour);
            System.out.print(answer);
        }
        return answer;
    }

}
