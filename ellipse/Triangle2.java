package ellipse;

import java.awt.*;

public class Triangle2 {
    private int x1, y1, x2, y2, x3, y3;
    private Color colour = Color.green;
    private boolean filled = false;

    public Triangle2(){
        x1 = 100;
        y1 = 150;
        x2 = 150;
        y2 = 50;
        x3 = 200;
        y3 = 150;
    }

    public Triangle2(int x1, int y1, int x2, int y2, int x3, int y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Triangle2(Point p1, Point p2, Point p3){
        this.x1 = p1.getX();
        this.y1 = p1.getY();
        this.x2 = p2.getX();
        this.y2 = p2.getY();
        this.x3 = p3.getX();
        this.y3 = p3.getY();
    }

    public Triangle2(int x1, int y1, int x2, int y2, int x3, int y3, boolean f){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.filled = f;
    }

    public void setFilled(){
        filled = true;
    }

    public void setFilled(boolean f){
        filled = f;
    }

    public void setColour(int r, int g, int b){
        colour = new Color(r, g, b);
    }

    public Color getColour(){
        return colour;
    }

    public void setPoint1(int x, int y){
        x1 = x;
        y1 = y;
    }

    public void setPoint2(int x, int y){
        x2 = x;
        y2 = y;
    }

    public void setPoint3(int x, int y){
        x3 = x;
        y3 = y;
    }

    public String toString(){
        return "Triangle[p1=(" + x1 + "," + y1 + "), p2=(" + x2 + "," + y2 + "), p3=(" + x3 + "," + y3 + "), colour=" + colour + ", filled=" + filled + "]";
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(colour);
        if(filled){
            int[] xPoints = {x1, x2, x3};
            int[] yPoints = {y1, y2, y3};
            g2d.fillPolygon(xPoints, yPoints, 3);
        }else{
            g2d.drawLine(x1, y1, x2, y2);
            g2d.drawLine(x2, y2, x3, y3);
            g2d.drawLine(x3, y3, x1, y1);
        }
    }
}
