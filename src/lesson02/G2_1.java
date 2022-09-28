package lesson02;

import lesson01.Undergraduate;

public class G2_1 {
  public static void main(String[] args) {
    Undergraduate[] list1 = {
            new Undergraduate("00AJ02", 3.5),
            new Undergraduate("00AJ01", 3.3),
            new Undergraduate("00AJ04", 2.5),
            new Undergraduate("00AJ00", 1.8),
            new Undergraduate("00AJ05", 2.3)
    };

    Integer[] list2 = {5,2,3,9,1};

    for(Object o: sort(list1)){
      System.out.println(o);
    }
    for(Object o: sort(list2)){
      System.out.println(o);
    }
  }

  public  static Object[] sort(Object[] list){
    for (Object o: list) {
      System.out.print(o instanceof Comparable);
      System.out.println(":" + o);
    }
    return list;
  }
}
