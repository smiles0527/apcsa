package Chapter6Labs/Loops;
public class PowerGenerator
{
    private double factor;
    private double current;

    public PowerGenerator(double aFactor)
    {
        factor = aFactor;
        current = 1.0;
    }

    public double nextPower()
    {
        current = current * factor;
        return current;
    }
}
