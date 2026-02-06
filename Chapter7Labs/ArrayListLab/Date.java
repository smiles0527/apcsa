package Chapter7Labs.ArrayListLab;
public class Date
{
    private int month;
    private int day;
    private int year;

    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    public boolean equals(Date other)
    {
        if(other == null) return false;
        return month == other.month && day == other.day && year == other.year;
    }

    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
}
