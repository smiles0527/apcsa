package chapter4labs;

public class SodaCan {
    private double height;
    private double diameter;

    public SodaCan(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        double radius = diameter / 2.0;
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}

