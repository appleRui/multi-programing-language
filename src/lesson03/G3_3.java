package lesson03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class G3_3 {
  public static void main(String[] args) {
    // Arrays.asList()：引数をリスト化
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);

    Comparator<Undergraduate> comparator = new Comparator<Undergraduate>() {
      @Override
      public int compare(Undergraduate o1, Undergraduate o2) {
        if(!o2.getGpa().equals(o1.getGpa())){
          return o2.getGpa().compareTo(o1.getGpa());
        }
        return o1.getId().compareTo(o2.getId());
      }
    };
    // Docs：https://docs.oracle.com/javase/jp/8/docs/api/java/util/Collections.html#sort-java.util.List-java.util.Comparator-
    Collections.sort(list1, comparator);
    for(Undergraduate u: list1){
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
