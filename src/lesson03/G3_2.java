package lesson03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class G3_2 {
  public static void main(String[] args) {
    // Arrays.asList()：引数をリスト化
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Comparator<Undergraduate> comparator = new UComparator();
    // Docs：https://docs.oracle.com/javase/jp/8/docs/api/java/util/Collections.html#sort-java.util.List-java.util.Comparator-
    Collections.sort(list1, comparator);
    for(Undergraduate u: list1){
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
