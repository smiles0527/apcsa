package Chapter2Labs/ShapesLab;

import java.awt.*;
import java.awt.geom.*;

public class Rectangle1
{
    private int xPosition;
    private int yPosition;
    private int width, height;
    private Color colour = Color.red;
    private boolean filled = false;

    public Rectangle1()
    {
        int x = 60, y = 50;
        double w = 50.7;
        xPosition = x;
        yPosition = y;
        width = (int) w;
        height = 30;
    }

    public Rectangle1(int xx, int yy, int w, int h)
    {
        xPosition = xx;
        yPosition = yy;
        width = w;
        height = h;
    }

    public Rectangle1(int xx, int yy, int w, int h, boolean f)
    {
        xPosition = xx;
        yPosition = yy;
        width = w;
        height = h;
        filled = f;
    }

    public void setFilled()
    {
        filled = true;
    }

    public void setFilled(boolean f)
    {
        filled = f;
    }

    public void setPosition(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }

    public int getWidth()
    {
        return width;
    }

    public void setXPosition(int x)
    {
        xPosition = x;
    }

    public void setYPosition(int y)
    {
        yPosition = y;
    }

    public void setWidth(int w)
    {
        width = w;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public void setColour(Color c)
    {
        colour = c;
    }

    public void setColour(int r, int g, int b)
    {
        colour = new Color(r, g, b);
    }

    public Color getColour()
    {
        return colour;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(colour);
        if(filled)
        {
            g2d.fillRect(xPosition, yPosition, width, height);
        }
        else
        {
            g2d.drawRect(xPosition, yPosition, width, height);
        }
    }

    public String toString()
    {
        return "Rectangle1[x=" + xPosition +
               ", y=" + yPosition +
               ", width=" + width +
               ", height=" + height +
               ", colour=" + colour +
               ", filled=" + filled + "]";
    }
}
