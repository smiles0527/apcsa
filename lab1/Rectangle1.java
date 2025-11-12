/**
 * A shape class for learning object construction.
 * @author Duncan Fraser
 * @version 2024
 */
import java.awt.*;
import java.awt.geom.*;

public class Rectangle1{
    private int xPosition;
    private int yPosition;
    private int width, height;
    private Color colour= Color.red;
    private boolean filled=false;

    // Question: What is the constructor's job?
    // Answer: The constructor's job is to initialize the instance variables
    // of a newly created object with specific values.
    public Rectangle1(){
        int x = 60, y = 50;
        double w=50.7;
        xPosition = x;
        yPosition = y;
        width = (int)w;
        height = 30;
    }

    public Rectangle1(int xx, int yy, int w, int h){
        xPosition = xx;
        yPosition = yy;
        width = w;
        height = h;
    }

    public Rectangle1(int xx, int yy, int w, int h, boolean f){
        xPosition = xx;
        yPosition = yy;
        width = w;
        height = h;
        filled = f;
    }

    public void setFilled(){
        filled = true;
    }

    // Question: Is this an accessor or a mutator method?
    // Answer: This is a MUTATOR method because it modifies the instance variables.
    public void setPosition(int x, int y){
        xPosition = x;
        yPosition = y;
    }

    public void setcolour(int r, int g, int b){
        colour= new Color(r,g,b);
    }

    public Color getcolour(){
        return colour;
    }

    // Question: Is this an accessor or a mutator method?
    // Answer: This is an ACCESSOR method because it returns a value without modifying it.
    public int getWidth(){
        return width;
    }

    // Question: What is the return type for a mutator method?
    // Answer: void
    // Question: How many arguments should be passed into a mutator method?
    // Answer: Typically ONE argument - the new value to set.
    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }

    public void setXPosition(int x){
        xPosition = x;
    }

    public void setYPosition(int y){
        yPosition = y;
    }

    public void setFilled(boolean f){
        filled = f;
    }

    // Question: What is the return type of the toString() method?
    // Answer: String
    // Question: What is the purpose of the toString() method?
    // Answer: To return a string representation of the object's current state.
    public String toString(){
        return "Rectangle1[x=" + xPosition + ", y=" + yPosition + ", width=" + width + ", height=" + height + ", colour=" + colour + ", filled=" + filled + "]";
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(colour);
        if(filled){
            g2d.fillRect(xPosition,yPosition,width,height);
        }else{
            g2d.drawRect(xPosition,yPosition,width,height);
        }
    }
}