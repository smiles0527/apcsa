package ellipse;

import rectangle.Rectangle1;
import rectangle.Circle1;
import javax.swing.JComponent;
import java.awt.*;

public class ShapeComponent2 extends JComponent{
    private Rectangle1 rect;
    private Rectangle1 rect2;
    private Circle1 circ1;
    private Triangle2 tri;
    private Triangle2 eyeLeft;
    private Triangle2 eyeRight;
    private Circle1 face;
    private Circle1 mouth;

    public ShapeComponent2(){
        // Question: Create 4 local integer variables, assign them values, 
        // and use them in a Rectangle1 constructor to construct a rectangle 
        // that is 100 x 200 and drawn at 150, 50

        // Which constructor should you use?
        // Answer: Use the parameterized constructor Rectangle1(int xx, int yy, int w, int h)

        // Where should the Rectangle1 be declared?
        // Answer: The Rectangle1 should be declared as an instance variable at the 
        // top of the class (private Rectangle1 rect;) so it can be used in both 
        // the constructor and paintComponent method.

        // Do the double variables work? Why not? How do you fix this?
        // Answer: No, double variables don't work because the Rectangle1 constructor 
        // expects int parameters. You need to cast the double to int using (int).

        // What do you have to change the double variables to?
        // Answer: Change them to int, or cast them to int when passing to the constructor.

        int len = 100;
        int wid = 200;
        int ex = 150;
        int wy = 50;

        rect = new Rectangle1(ex, wy, len, wid);

        // Create a second rectangle using default constructor
        rect2 = new Rectangle1();
        // Change values using mutator functions
        rect2.setPosition(300, 100);
        rect2.setWidth(80);
        rect2.setHeight(120);
        rect2.setFilled(true);
        // Make it blue using setcolour
        rect2.setcolour(0, 0, 250);

        // Create a circle
        circ1 = new Circle1(400, 200, 60);
        circ1.setFilled();
        circ1.setColour(255, 200, 0);

        // Create a triangle using Point objects
        Point p1 = new Point(100, 300);
        Point p2 = new Point(150, 250);
        Point p3 = new Point(200, 300);
        tri = new Triangle2(p1, p2, p3);
        tri.setFilled();
        tri.setColour(255, 100, 200);

        // Create an EMOJI using shapes!
        // Yellow face
        face = new Circle1(250, 50, 150);
        face.setFilled();
        face.setColour(255, 220, 0);

        // Eyes (triangles)
        eyeLeft = new Triangle2(280, 90, 290, 110, 270, 110);
        eyeLeft.setFilled();
        eyeLeft.setColour(0, 0, 0);

        eyeRight = new Triangle2(350, 90, 360, 110, 340, 110);
        eyeRight.setFilled();
        eyeRight.setColour(0, 0, 0);

        // Smile (small circle for mouth)
        mouth = new Circle1(300, 140, 50);
        mouth.setFilled();
        mouth.setColour(0, 0, 0);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        // Draw the rectangles
        rect.draw(g2);
        rect2.draw(g2);

        // Draw circle
        circ1.draw(g2);

        // Draw triangle
        tri.draw(g2);

        // Draw emoji
        face.draw(g2);
        eyeLeft.draw(g2);
        eyeRight.draw(g2);
        mouth.draw(g2);

        // Cover the top half of mouth circle with yellow to make smile
        g2.setColor(new Color(255, 220, 0));
        g2.fillRect(300, 140, 50, 25);

        String info = new String("Shapes Lab 2 - Triangles and Emojis!");
        g.drawString(info, 50, 450);
    }
}