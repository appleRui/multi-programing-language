package lesson03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class G3_1 {
  public static void main(String[] args) {
    // Arrays.asList()：引数をリスト化
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    // https://itsakura.com/java-arraylist-sort
    Collections.sort(list1);
    for(Undergraduate u: list1){
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
