package Chapter2Labs/ShapesLab;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(int xx, int yy)
    {
        x = xx;
        y = yy;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int xx)
    {
        x = xx;
    }

    public void setY(int yy)
    {
        y = yy;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
