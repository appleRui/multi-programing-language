package lesson01;
import java.util.Objects;

public class Undergraduate {
  private String id;
  private double gpa;
  public Undergraduate(String id, double gpa) {
    this.id = id;
    this.gpa = gpa;
  }
  public double getGpa() {
    return this.gpa;
  }
  public void setGpa(double gpa) {
    this.gpa = gpa;
  }
  public String getId() {
    return this.id;
  }
  @Override
  public boolean equals(Object other) {
    if (!this.getClass().isInstance(other)) {
      return false;
    }
    Undergraduate undergraduate = this.getClass().cast(other);
    return Objects.equals(this.id, undergraduate.id)
            /*&& Objects.equals(this.gpa, undergraduate.gpa)*/;
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.id/*, this.gpa*/);
  }
}
