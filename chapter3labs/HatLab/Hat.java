package Chapter3Labs/HatLab;

import java.awt.*;

@author Curtis Wei
@time 2026

public class Hat
{
    private int x;
    private int y;
    private int width;
    private int height;
    private int brim;
    private Color colour;

    public Hat()
    {
        x = 100;
        y = 100;
        width = 120;
        height = 80;
        brim = 20;
        colour = Color.red;
    }

    public Hat(int xx, int yy, int w, int h, int b, Color c)
    {
        x = xx;
        y = yy;
        width = w;
        height = h;
        brim = b;
        colour = c;
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

    public void setBrim(int b)
    {
        brim = b;
    }

    public void setColour(Color c)
    {
        colour = c;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getBrim()
    {
        return brim;
    }

    public Color getColour()
    {
        return colour;
    }

    public void draw(Graphics2D g2)
    {
        g2.setColor(colour);

        int left = x;
        int right = x + width;
        int top = y;
        int bottom = y + height;

        g2.drawLine(left, bottom, right, bottom);
        g2.drawLine(left, top, right, top);
        g2.drawLine(left, top, left, bottom);
        g2.drawLine(right, top, right, bottom);

        int brimLeft = x - brim;
        int brimRight = x + width + brim;
        int brimY = bottom;

        g2.drawLine(brimLeft, brimY, brimRight, brimY);
    }
}
