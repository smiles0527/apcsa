package Chapter4Labs/MathdataLab;

public class DataSet
{
    private int sum;
    private int count;

    public DataSet()
    {
        sum = 0;
        count = 0;
    }

    public void addValue(int x)
    {
        sum += x;
        count += 1;
    }

    public int getSum()
    {
        return sum;
    }

    public double getAverage()
    {
        if(count == 0)
        {
            return 0.0;
        }
        return (double) sum / (double) count;
    }
}
