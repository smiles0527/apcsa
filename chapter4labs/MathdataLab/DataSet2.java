package Chapter4Labs.MathdataLab;

public class DataSet2
{
    private int smallest;
    private int largest;
    private int count;

    public DataSet2()
    {
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
        count = 0;
    }

    public void addValue(int x)
    {
        smallest = Math.min(smallest, x);
        largest = Math.max(largest, x);
        count += 1;
    }

    public int getLargest()
    {
        if(count == 0)
        {
            return 0;
        }
        return largest;
    }

    public int getSmallest()
    {
        if(count == 0)
        {
            return 0;
        }
        return smallest;
    }
}
