package lesson01;

public class G1_5 {
  public static void main(String[] args) {
    Undergraduate[] list = {
            new Undergraduate("00AJ02", 3.5),
            new Undergraduate("00AJ01", 3.3),
            new Undergraduate("00AJ04", 2.5),
            new Undergraduate("00AJ00", 1.8),
            new Undergraduate("00AJ05", 2.3)
    };

    for (Undergraduate v: sort(list)) {
      System.out.println(v.getId() + " " + v.getGpa());
    }
  }

  public static  Undergraduate[] sort (Undergraduate[] list) {
    for (int i = 0; i<list.length-1; i++){
      for (int j = 0; j < list.length-1-i; j++){
        Undergraduate v1 = list[j];
        Undergraduate v2 = list[j+1];
        // ソートできるようにする(ID順でソートする)
        if(false) {
          Undergraduate tmp = list[j];
          list[j] = list[j+1];
          list[j+1] = tmp;
        }
      }
    }
    return list;
  }
}
