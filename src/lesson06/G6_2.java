package lesson06;

import lesson03.GData;
import lesson03.Undergraduate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class G6_2 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Function<Undergraduate, String> keyExtractor = Undergraduate::getId;

    list1.forEach((u) -> {
      System.out.println(keyExtractor.apply(u));
    });
  }
}
