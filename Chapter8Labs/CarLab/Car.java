public class Car{
  private String name;
  public static int count;

  public Car(){
    name = "Tesla";
  }

  public Car(String carName){
    name = carName; count++;
  }

  public String getName(){ return name; }
  public static int getCount(){ return count; }
}
