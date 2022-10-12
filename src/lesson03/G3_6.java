package lesson03;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class G3_6 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData2.DATA1);
    /**
     * AJ-> AD順
     * GPA順
     *
     * 出力結果
     * "00AJ02", 3.5
     * "00AJ11", 3.5
     * "00AJ04", 2.5
     * "00AJ05", 2.3
     * "00AJ00", 1.8
     * "00AD22", 3.1
     */

    // 1. AJ -> ADで並べる
    Comparator<Undergraduate> comparator = new Comparator<Undergraduate>() {
      @Override
      public int compare(Undergraduate o1, Undergraduate o2) {
//        if(!o2.getGpa().equals(o1.getGpa())){
//          if(o2.getId().equals(o1.getId())){
//            return o2.getGpa().compareTo(o1.getGpa());
//          }
//          return o1.getGpa().compareTo(o2.getGpa());
//        }
//        return o2.getId().compareTo(o1.getId());
//      }
    };
    // 2. GPA順で並べる
//    Comparator<Undergraduate> newComparator = comparator.thenComparing(Comparator.naturalOrder());;
    Collections.sort(list1, comparator);
    for (Undergraduate u: list1) {
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
