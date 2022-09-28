package lesson02;

import lesson01.Undergraduate;

public class G2_3 {
  public static void main(String[] args) {
    Undergraduate[] list1 = {
            new Undergraduate("00AJ02", 3.5),
            new Undergraduate("00AJ01", 3.3),
            new Undergraduate("00AJ04", 2.5),
            new Undergraduate("00AJ00", 1.8),
            new Undergraduate("00AJ05", 2.3)
    };

    for (Undergraduate v: sort(list1)){
      System.out.println(v.getId());
    }

//    Integer[] list2 = {5,2,3,9,1};
//
//    for(Object o: sort(list1)){
//      System.out.println(o);
//    }
//    for(Object o: sort(list2)){
//      System.out.println(o);
//    }
  }

  public  static <T> T[] sort(T[] list){
    for (int i = 0; i<list.length-1; i++){
      for (int j = 0; j < list.length-1-i; j++){
        T v1 = list[j];
        T v2 = list[j+1];
        if( v1 instanceof Comparable){
          Comparable c1 = (Comparable)v1;
          Comparable c2 = (Comparable)v2;
          if(c1.compareTo(c2) > 0){
            T tmp = list[j];
            list[j] = list[j+1];
            list[j+1] = tmp;
          }
        }
      }
    }
    return list;
  }
}
