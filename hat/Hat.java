package hat;

import java.awt.*;

/**
 * The Hat class models a hat with a height, width, brim size, and color.
 * @author Your Name
 * @version 2024
 */
public class Hat {
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private int brimSize;
    private Color colour = Color.BLACK;

    /**
     * Default Constructor
     * Creates a new Hat object with default location and size
     */
    public Hat() {
        xPosition = 100;
        yPosition = 100;
        width = 80;
        height = 60;
        brimSize = 20;
        colour = Color.BLACK;
    }

    /**
     * Constructor with position and size parameters
     * @param x the x position of the hat
     * @param y the y position of the hat (top of the hat body)
     * @param w the width of the hat body
     * @param h the height of the hat body
     * @param brim the size of the brim (how much it extends on each side)
     */
    public Hat(int x, int y, int w, int h, int brim) {
        xPosition = x;
        yPosition = y;
        width = w;
        height = h;
        brimSize = brim;
        colour = Color.BLACK;
    }

    /**
     * Constructor with position, size, and color parameters
     * @param x the x position of the hat
     * @param y the y position of the hat (top of the hat body)
     * @param w the width of the hat body
     * @param h the height of the hat body
     * @param brim the size of the brim (how much it extends on each side)
     * @param c the color of the hat
     */
    public Hat(int x, int y, int w, int h, int brim, Color c) {
        xPosition = x;
        yPosition = y;
        width = w;
        height = h;
        brimSize = brim;
        colour = c;
    }

    /**
     * Sets the position of the hat
     * @param x the x position
     * @param y the y position
     */
    public void setPosition(int x, int y) {
        xPosition = x;
        yPosition = y;
    }

    /**
     * Sets the color of the hat using RGB values
     * @param r red component (0-255)
     * @param g green component (0-255)
     * @param b blue component (0-255)
     */
    public void setColour(int r, int g, int b) {
        colour = new Color(r, g, b);
    }

    /**
     * Gets the color of the hat
     * @return the color of the hat
     */
    public Color getColour() {
        return colour;
    }

    /**
     * Gets the height of the hat
     * @return the height of the hat body
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the width of the hat
     * @return the width of the hat body
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the brim size of the hat
     * @return the brim size
     */
    public int getBrimSize() {
        return brimSize;
    }

    /**
     * Draw method that draws the hat using drawLine
     * The hat consists of:
     * - A brim (horizontal line at the bottom)
     * - A hat body (trapezoid shape)
     * @param g2d the Graphics2D object to draw with
     */
    public void draw(Graphics2D g2d) {
        g2d.setColor(colour);
        
        // Calculate key points
        int brimLeft = xPosition - brimSize;
        int brimRight = xPosition + width + brimSize;
        int brimY = yPosition + height;
        
        int topLeft = xPosition;
        int topRight = xPosition + width;
        int topY = yPosition;
        
        // Draw the brim (horizontal line at the bottom)
        g2d.drawLine(brimLeft, brimY, brimRight, brimY);
        
        // Draw the left side of the hat body (from top left to brim left)
        g2d.drawLine(topLeft, topY, brimLeft, brimY);
        
        // Draw the right side of the hat body (from top right to brim right)
        g2d.drawLine(topRight, topY, brimRight, brimY);
        
        // Draw the top of the hat body (horizontal line at the top)
        g2d.drawLine(topLeft, topY, topRight, topY);
    }
}

