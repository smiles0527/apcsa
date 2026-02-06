package Chapter3Labs;

import java.awt.*;

/*
Paste this inside paintComponent
for(int i = 0; i < 8; i++)
{
    Triangle t = new Triangle();
    t.setPosition(40 + i * 60, 200);
    t.setSize(50, 50);
    t.draw(g2);
}
 */

public class Triangle
{
    private int x;
    private int y;
    private int width;
    private int height;
    private Color colour = Color.black;

    public Triangle()
    {
        x = 0;
        y = 0;
        width = 50;
        height = 50;
    }

    public Triangle(int xx, int yy, int w, int h)
    {
        x = xx;
        y = yy;
        width = w;
        height = h;
    }

    public void setPosition(int xx, int yy)
    {
        x = xx;
        y = yy;
    }

    public void setSize(int w, int h)
    {
        width = w;
        height = h;
    }

    public void setColour(Color c)
    {
        colour = c;
    }

    public void draw(Graphics2D g2)
    {
        g2.setColor(colour);

        int x1 = x;
        int y1 = y + height;

        int x2 = x + width / 2;
        int y2 = y;

        int x3 = x + width;
        int y3 = y + height;

        g2.drawLine(x1, y1, x2, y2);
        g2.drawLine(x2, y2, x3, y3);
        g2.drawLine(x3, y3, x1, y1);
    }
}
