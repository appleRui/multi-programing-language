package lesson03;

import java.util.Objects;

public class Undergraduate implements Comparable<Undergraduate> {
  private String id;
  private Double gpa;
  public Undergraduate(String id, Double gpa) {
    this.id = id;
    this.gpa = gpa;
  }
  public Double getGpa() {
    return this.gpa;
  }
  public void setGpa(Double gpa) {
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
    return Objects.equals(this.id, undergraduate.id) /*&& Objects.equals(this.gpa, undergraduate.gpa)*/;
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.id/*, this.gpa*/);
  }
  @Override
  public int compareTo(Undergraduate undergraduate) {
    return this.getId().compareTo(undergraduate.getId());
  }
}
