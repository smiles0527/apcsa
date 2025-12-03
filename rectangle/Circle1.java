package rectangle;

import java.awt.*;
import java.awt.geom.*;

public class Circle1{
    private int xPosition;
    private int yPosition;
    private int diameter;
    private Color colour = Color.blue;
    private boolean filled = false;

    public Circle1(){
        xPosition = 150;
        yPosition = 100;
        diameter = 50;
    }

    public Circle1(int xx, int yy, int d){
        xPosition = xx;
        yPosition = yy;
        diameter = d;
    }

    public Circle1(int xx, int yy, int d, boolean f){
        xPosition = xx;
        yPosition = yy;
        diameter = d;
        filled = f;
    }

    public void setFilled(){
        filled = true;
    }

    public void setPosition(int x, int y){
        xPosition = x;
        yPosition = y;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setDiameter(int d){
        diameter = d;
    }

    public void setXPosition(int x){
        xPosition = x;
    }

    public void setYPosition(int y){
        yPosition = y;
    }

    public void setColour(int r, int g, int b){
        colour = new Color(r, g, b);
    }

    public void setFilled(boolean f){
        filled = f;
    }

    public Color getColour(){
        return colour;
    }

    // Question: What is the return type of the toString() method?
    // Answer: The return type is String.
    // Question: What is the purpose of the toString() method?
    // Answer: The purpose of the toString() method is to return a string
    // representation of the object that describes its current state.
    public String toString(){
        return "Circle1[x=" + xPosition + ", y=" + yPosition + ", diameter=" + diameter + ", colour=" + colour + ", filled=" + filled + "]";
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(colour);
        if(filled){
            g2d.fillOval(xPosition, yPosition, diameter, diameter);
        }else{
            g2d.drawOval(xPosition, yPosition, diameter, diameter);
        }
    }
}