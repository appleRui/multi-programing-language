package lesson04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class G4_6 {
  public static void main(String[] args) {
    List<String> xs = Arrays.asList("a", "b", "c", "d", "e");
    UnaryOperator<String> op = (s) -> s.toUpperCase();

    xs.replaceAll(op);

    Consumer<String> consumer = (s) -> System.out.println(s);
    xs.forEach(consumer.andThen((s) -> System.out.println(" ")));
  }
}
