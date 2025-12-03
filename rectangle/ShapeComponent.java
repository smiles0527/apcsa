package rectangle;

import javax.swing.JComponent;
import java.awt.*;

public class ShapeComponent extends JComponent{
    private Rectangle1 rec1;
    private Circle1 circ1;

    public ShapeComponent(){
        rec1 = new Rectangle1(60, 50, 100, 60);
        rec1.setFilled();
        rec1.setPosition(80, 100);
        int width = rec1.getWidth();
        System.out.println("Rectangle width: " + width);
        rec1.setWidth(120);
        rec1.setHeight(80);

        circ1 = new Circle1(250, 150, 80);
        circ1.setFilled();
        circ1.setColour(50, 150, 255);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        rec1.draw(g2);
        circ1.draw(g2);
        String hold = new String("This makes it more powerful");
        g.drawString(hold, 80, 400);
    }
}