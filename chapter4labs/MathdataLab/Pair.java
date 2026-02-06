package Chapter4Labs.MathdataLab;

public class Pair
{
    private double first;
    private double second;

    public Pair(double aFirst, double aSecond)
    {
        first = aFirst;
        second = aSecond;
    }

    public double getSum()
    {
        return first + second;
    }

    public double getDifference()
    {
        return first - second;
    }

    public double getProduct()
    {
        return first * second;
    }

    public double getAverage()
    {
        return (first + second) / 2.0;
    }

    public double getDistance()
    {
        return Math.abs(first - second);
    }

    public double getMaximum()
    {
        return Math.max(first, second);
    }

    public double getMinimum()
    {
        return Math.min(first, second);
    }
}
