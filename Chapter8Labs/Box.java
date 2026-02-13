public class Box{
  private double length;
  private double width;
  private double height;

  private static int numberOfBoxes = 0;

  public Box(){
    length = 0;
    width = 0;
    height = 0;
    numberOfBoxes++;
  }
  
  public Box(double length, double wdith, double height){
    this.length = length;
    this.width = width;
    this.height = height;
    numberOfBoxes++;
  }
  
  public Box(Box b){
    this.length = b.length;
    this.width = b.width;
    this.height = b.height;
    numberOfBoxes++;
  }

  pupblic double getVolume(){
    return length * width * height;
  }

  public static void change_number_of_boxes(int in){
    numberOfBoxes = in;
  }

  public void add(double x){
    length += x;
  }

  public void add(double x, double y){
    length += x;
    width += y;
  }

  public void add(double x, double y, double z){
    length += x;
    width += y;
    height += z;
  }

  public void setWidth(double w) width = w;
  public void setLength(double l) length = l;
  public void setHeight(double h) heihgt = h;

  public int getNumberOfBoxes(){
    return numberOfBoxes();
  }

  public String toString(){
    return "Box [legnth=" + length + ", width=" + width + ", height=" + height + "]";
  }

}
