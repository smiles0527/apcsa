package Chapter2Labs.ShapesLab;

import java.awt.*;

public class Triangle_3Points
{
    private Point p1;
    private Point p2;
    private Point p3;
    private Color colour = Color.green;

    public Triangle()
    {
        p1 = new Point(80, 200);
        p2 = new Point(40, 280);
        p3 = new Point(140, 280);
    }

    public Triangle(Point a, Point b, Point c)
    {
        p1 = a;
        p2 = b;
        p3 = c;
    }

    public void setColour(Color c)
    {
        colour = c;
    }

    public void setPoint1(Point a)
    {
        p1 = a;
    }

    public void setPoint2(Point b)
    {
        p2 = b;
    }

    public void setPoint3(Point c)
    {
        p3 = c;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(colour);
        g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        g2d.drawLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        g2d.drawLine(p3.getX(), p3.getY(), p1.getX(), p1.getY());
    }

    public String toString()
    {
        return "Triangle[p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", colour=" + colour + "]";
    }
}
