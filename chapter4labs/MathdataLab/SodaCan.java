package Chapter4Labs.MathdataLab;

public class SodaCan
{
    private double height;
    private double diameter;

    public SodaCan(double h, double d)
    {
        height = h;
        diameter = d;
    }

    public double getVolume()
    {
        double r = diameter / 2.0;
        return Math.PI * r * r * height;
    }

    public double getSurfaceArea()
    {
        double r = diameter / 2.0;
        double side = 2.0 * Math.PI * r * height;
        double topBottom = 2.0 * Math.PI * r * r;
        return side + topBottom;
    }
}
