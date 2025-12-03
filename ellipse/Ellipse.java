package ellipse;

import java.awt.*;
import java.awt.geom.*;

public class Ellipse{
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private Color fillColour;
    private Color outlineColour;

    public Ellipse(){
        xPosition = 0;
        yPosition = 0;
        width = 400;
        height = 300;
        fillColour = new Color(147, 51, 234); // Purple - my favorite!
        outlineColour = Color.BLACK;
    }

    public Ellipse(int x, int y, int w, int h, Color fill){
        xPosition = x;
        yPosition = y;
        width = w;
        height = h;
        fillColour = fill;
        outlineColour = Color.BLACK;
    }

    public void setSize(int w, int h){
        width = w;
        height = h;
    }

    public void setPosition(int x, int y){
        xPosition = x;
        yPosition = y;
    }

    public void setFillColour(int r, int g, int b){
        fillColour = new Color(r, g, b);
    }

    public void setOutlineColour(Color c){
        outlineColour = c;
    }

    public void draw(Graphics2D g2d){
        // Draw filled ellipse
        g2d.setColor(fillColour);
        g2d.fillOval(xPosition, yPosition, width, height);

        // Draw black outline
        g2d.setColor(outlineColour);
        g2d.drawOval(xPosition, yPosition, width, height);
    }
}
