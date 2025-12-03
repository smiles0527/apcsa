package src;

public class Circle {
    public double radius;
    public double diameter;
    public double area;
    public double circumference;
    public double x;
    public double y;
    public String color;
    public String label;
    public boolean filled;
    public int thickness;
    public int id;

    private static int nextId = 1;

    public Circle() {
        radius = 1.0;
        x = 0.0;
        y = 0.0;
        color = "black";
        label = "";
        filled = false;
        thickness = 1;
        id = nextId++;
        updateDerived();
    }

    public Circle(double radius, double x, double y, String color, String label, boolean filled, int thickness) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
        this.label = label;
        this.filled = filled;
        this.thickness = thickness;
        this.id = nextId++;
        updateDerived();
    }

    public void setRadius(double r) {
        radius = r;
        updateDerived();
    }

    public void setDiameter(double d) {
        radius = d / 2.0;
        updateDerived();
    }

    public void moveTo(double nx, double ny) {
        x = nx;
        y = ny;
    }

    public void updateDerived() {
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle#" + id +
                " r=" + radius +
                " d=" + diameter +
                " area=" + area +
                " c=" + circumference +
                " center=(" + x + "," + y + ")" +
                " color=" + color +
                " label=" + label +
                " filled=" + filled +
                " thickness=" + thickness;
    }
}
