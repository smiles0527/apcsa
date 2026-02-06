package Chapter2Labs/ShapesLab;

import java.awt.*;

public class Circle1
{
    private int xPosition;
    private int yPosition;
    private int diameter;
    private Color colour = Color.blue;
    private boolean filled = false;

    public Circle1()
    {
        xPosition = 180;
        yPosition = 60;
        diameter = 60;
    }

    public Circle1(int x, int y, int d)
    {
        xPosition = x;
        yPosition = y;
        diameter = d;
    }

    public Circle1(int x, int y, int d, boolean f)
    {
        xPosition = x;
        yPosition = y;
        diameter = d;
        filled = f;
    }

   public void setColour(Color c)
    {
        colour = c;
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

    public void setDiameter(int d)
    {
        diameter = d;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(colour);
        if(filled)
        {
            g2d.fillOval(xPosition, yPosition, diameter, diameter);
        }
        else
        {
            g2d.drawOval(xPosition, yPosition, diameter, diameter);
        }
    }

    public String toString()
    {
        return "Circle1[x=" + xPosition +
               ", y=" + yPosition +
               ", diameter=" + diameter +
               ", colour=" + colour +
               ", filled=" + filled + "]";
    }
}
