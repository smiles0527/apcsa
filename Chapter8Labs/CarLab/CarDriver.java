public class CarDriver(){
  public static void main(String[] str){
    Car car1 = new Car("Mustang");
    Car car2 = new Car("Charger");
    Car car3 = new Car("Corvette");
    Car car3 = new Car();

    System.out.println("Car One is a " + car1.getName());
    System.out.println("Car Two is a " + car2.getName());
    System.out.println("Car Three is a " + car3.getName());
    System.out.println("Car Four is a " + car4.getName())
    System.out.println("There are " + Car.getCount() + " cars");
  }
}
