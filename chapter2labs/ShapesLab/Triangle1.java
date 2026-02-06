package Chapter2Labs/ShapesLab;

import java.awt.*;

public class Triangle1
{
    private int x1, y1;
    private int x2, y2;
    private int x3, y3;
    private Color colour = Color.green;
    private boolean filled = false;

    public Triangle1()
    {
        x1 = 80;  y1 = 200;
        x2 = 40;  y2 = 280;
        x3 = 140; y3 = 280;
    }

    public Triangle1(int ax, int ay, int bx, int by, int cx, int cy)
    {
        x1 = ax; y1 = ay;
        x2 = bx; y2 = by;
        x3 = cx; y3 = cy;
    }

    public Triangle1(int ax, int ay, int bx, int by, int cx, int cy, boolean f)
    {
        x1 = ax; y1 = ay;
        x2 = bx; y2 = by;
        x3 = cx; y3 = cy;
        filled = f;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(colour);
        int[] xs = { x1, x2, x3 };
        int[] ys = { y1, y2, y3 };

        if(filled)
        {
            g2d.fillPolygon(xs, ys, 3);
        }
        else
        {
            g2d.drawPolygon(xs, ys, 3);
        }
    }

    public void setFilled()
    {
        filled = true;
    }

    public void setFilled(boolean f)
    {
        filled = f;
    }

    public void setColour(Color c)
    {
        colour = c;
    }

    public void setPoint1(int x, int y)
    {
        x1 = x;
        y1 = y;
    }

    public void setPoint2(int x, int y)
    {
        x2 = x;
        y2 = y;
    }

    public void setPoint3(int x, int y)
    {
        x3 = x;
        y3 = y;
    }

    public String toString()
    {
        return "Triangle1[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + "),(" + x3 + "," + y3 +
               "), colour=" + colour + ", filled=" + filled + "]";
    }
}
