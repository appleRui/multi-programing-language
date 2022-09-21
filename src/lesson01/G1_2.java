package lesson01;

public class G1_2 {
  public static void main(String[] args) {
    Double[] list = {5.0, 2.5, 3.3, 3.2, 3.0};
    for (Double v: sort(list)) {
      System.out.println(v);
    }
  }

  public static Double[] sort (Double[] list) {
    for (int i = 0; i<list.length-1; i++){
      for (int j = 0; j < list.length-1-i; j++){
        Double v1 = list[j];
        Double v2 = list[j+1];
        if(v1-v2 > 0) {
          Double tmp = list[j];
          list[j] = list[j+1];
          list[j+1] = tmp;
        }
      }
    }
    return list;
  }
}
