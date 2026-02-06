package Chapter7Labs/TempPop;
public class MonthTemp
{
    private String month;
    private double high;

    public MonthTemp(String m, double h)
    {
        month = m;
        high = h;
    }

    public String getMonth()
    {
        return month;
    }

    public double getHigh()
    {
        return high;
    }

    public void setHigh(double h)
    {
        high = h;
    }

    public String toString()
    {
        return month + ": " + high;
    }
}
