package lesson05;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAmount;

@FunctionalInterface
public interface DOBUtil {
  public LocalDate getDOB();
  default  public int getAge(LocalDate date){
    return Period.between(this.getDOB(), date).getYears();
  }

  default public int getAge(){
    return this.getAge(LocalDate.now());
  }

  default public DOBUtil plus(TemporalAmount amount){
    return ()-> this.getDOB().plus(amount);
  }
}
