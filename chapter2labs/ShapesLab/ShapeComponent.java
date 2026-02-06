package Chapter2Labs/ShapesLab;

import javax.swing.*;
import java.awt.*;

public class ShapeComponent extends JComponent
{
    private Rectangle1 rect1;
    private Rectangle1 rect2;

    private Circle1 face;
    private Circle1 eyeL;
    private Circle1 eyeR;

    private Triangle nose;

    public ShapeComponent()
    {
        /*
         * Which constructor should you use?
         * Use the Rectangle1 constructor that takes (x, y, width, height).
         *
         * Where should the Rectangle1 be declared?
         * As an instance variable (field) at the top of the class, so paintComponent can draw it.
         */

        int len = 100;

        /*
         * Do the double variables work? Why not?
         * Not directly, because the Rectangle1 constructor expects int arguments, not double.
         *
         * How do you fix this?
         * Use int variables, or cast to int.
         *
         * What do you have to change the double variables to?
         * Change them to int (best choice for this lab).
         */
        int wid = 200;
        int ex = 150;
        int wy = 50;

        rect1 = new Rectangle1(ex, wy, len, wid);

        /*
         * Create a second rectangle and draw it:
         * Use default constructor, then change values using mutators.
         */
        rect2 = new Rectangle1();
        rect2.setPosition(30, 50);
        rect2.setWidth(80);
        rect2.setHeight(120);

        /*
         * Use the setcolour method in Rectangle1 to make the second rectangle blue:
         */
        rect2.setcolour(0, 0, 250);

        /*
         * Triangle using 3 Point objects:
         */
        Point a = new Point(340, 80);
        Point b = new Point(280, 180);
        Point c = new Point(400, 180);
        nose = new Triangle(a, b, c);

        /*
         * Using Rectangle1, Circle1, and Triangle classes, draw an emoji:
         * Face + eyes + triangle nose (simple emoji-like face).
         */
        face = new Circle1(140, 260, 160, true);
        face.setColour(new Color(255, 220, 0));

        eyeL = new Circle1(180, 300, 20, true);
        eyeL.setColour(Color.black);

        eyeR = new Circle1(240, 300, 20, true);
        eyeR.setColour(Color.black);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        rect1.draw(g2);
        rect2.draw(g2);

        nose.draw(g2);

        face.draw(g2);
        eyeL.draw(g2);
        eyeR.draw(g2);

        String hold = new String("This makes it more powerful");
        g.drawString(hold, 80, 400);

        g.drawString(rect1.toString(), 20, 430);
        g.drawString(rect2.toString(), 20, 450);
        g.drawString(nose.toString(), 20, 470);
    }
}
