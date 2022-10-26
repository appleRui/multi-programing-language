package lesson06;

import lesson03.GData;
import lesson03.Undergraduate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class G6_3 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Function<Undergraduate, String> keyExtractor = Undergraduate::getId;

    Comparator<Undergraduate> comparator = (u1, u2) -> keyExtractor.apply(u1).compareTo(keyExtractor.apply(u2));
    Collections.sort(list1, comparator);

    list1.forEach((u) -> {
      System.out.println(u.getId() + " " + u.getGpa());
    });
  }
}
