package lesson05;

public class Essence {
  private String id;
  private String name;

  public Essence(){}

  public String getName(){
    return this.name;
  }

  public Essence setName(String name){
    this.name = name;
    return this;
  }

  public String getId(){
    return this.id;
  }
  public Essence setId(String id){
    this.id = id;
    return this;
  }

}
