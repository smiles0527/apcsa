public class Box{
    private int length;
    private int width;
    private int height;
    private static int number_of_boxes;

    public Box(){
        this.length=0;
        this.width=0;
        this.height=0;
    }

    public Box(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public Box(Box B){
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
    }

    public double getVolume() return (double)length*width*height;
    public static void change_number_of_boxes(int in) number_of_boxes = in;
    public void add(double x) length += x;

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
    public void setHeight(double h) height = h;
    public int getNUmberOfBoxes() return number_of_boxes;
    public String toString(){  return ("length =" + length + " height= " + height + " width= " + width);

}