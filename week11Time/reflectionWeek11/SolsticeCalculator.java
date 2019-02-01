package week11Time.reflectionWeek11;

import java.time.LocalDate;
import java.time.Month;

public class SolsticeCalculator {

  public LocalDate findSummerSolstice(Integer year){
      if(LocalDate.of(year,1,1).isLeapYear())
          return LocalDate.of(year, Month.JUNE,20);
      return LocalDate.of(year,Month.JUNE,21);
  }

    public LocalDate findWinterSolstice(Integer year){
        if(LocalDate.of(year+1,1,1).isLeapYear())
            return LocalDate.of(year, Month.DECEMBER,22);
        return LocalDate.of(year,Month.DECEMBER,21);
    }

}
