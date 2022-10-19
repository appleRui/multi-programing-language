package lesson05;

import java.time.LocalDate;

public class G5_3 {
  public static void main(String[] args) {
    Student u = new Student(LocalDate.of(1994, 6, 1));
    System.out.println(u.getAge());
  }

  private static class Student implements DOBUtil{
    private  LocalDate dob;
    public Student (LocalDate dob){
      this.dob = dob;
    }
    @Override
    public LocalDate getDOB(){
      return this.dob;
    }
  }
}
