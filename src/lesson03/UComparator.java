package lesson03;

import java.util.Comparator;

/**
 * docs：https://docs.oracle.com/javase/jp/8/docs/api/java/util/Comparator.html
 * 参考：https://qiita.com/kenduck/items/1d4ce84a476eac6247eb
 */
public class UComparator implements Comparator<Undergraduate> {
  @Override
  public int compare(Undergraduate o1, Undergraduate o2) {
    return o2.getGpa().compareTo(o1.getGpa());
  }
}
