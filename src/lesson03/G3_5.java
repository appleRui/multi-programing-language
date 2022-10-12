package lesson03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class G3_5 {
  public static void main(String[] args) {
    // Arrays.asList()：引数をリスト化
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Comparator<Undergraduate> comparator = new Comparator<Undergraduate>() {
      @Override
      public int compare(Undergraduate o1, Undergraduate o2) {
        return o2.getGpa().compareTo(o1.getGpa());
      }
    };
    Comparator<Undergraduate> newComparator = comparator.reversed().thenComparing(Comparator.naturalOrder());
    // Docs：https://docs.oracle.com/javase/jp/8/docs/api/java/util/Collections.html#sort-java.util.List-java.util.Comparator-
    Collections.sort(list1, newComparator);
    for(Undergraduate u: list1){
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
