public class Box {

    private double length;
    private double width;
    private double height;

    private static int numberOfBoxes = 0;

    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
        numberOfBoxes++;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        numberOfBoxes++;
    }

    public Box(Box b) {
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
        numberOfBoxes++;
    }

    public double getVolume() {
        return length * width * height;
    }

    public static void change_number_of_boxes(int in) {
        numberOfBoxes = in;
    }

    public void add(double x) {
        length += x;
    }

    public void add(double x, double y) {
        length += x;
        width += y;
    }

    public void add(double x, double y, double z) {
        length += x;
        width += y;
        height += z;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setHeight(double h) {
        height = h;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public String toString() {
        return "Box[length=" + length + ", width=" + width + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
