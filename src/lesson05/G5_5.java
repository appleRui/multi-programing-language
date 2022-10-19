package lesson05;

import java.util.function.Function;

public class G5_5 {
  private static Function<Integer, String> repeat;
  public static void main(String[] args) {
    repeat = (i) -> (i <= 0 ? "":"a"+repeat.apply(i-1));
    for (int i = 0; i < 5; i++){
      System.out.println(repeat.apply(i+1));
    }
  }
}
