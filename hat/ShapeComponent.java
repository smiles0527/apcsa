package hat;

/**
 * A helper class for showing basic shapes using JComponent.
 * @author Duncan Fraser
 * @version 2024
 */

 import java.awt.Graphics;

 import java.awt.Graphics2D;
 
 import javax.swing.JComponent;
 
public class ShapeComponent extends JComponent
{
    private Rectangle1 rec1;
    private Hat hat1;
    

    public ShapeComponent()
    {
        rec1= new Rectangle1();
        hat1 = new Hat(200, 50, 100, 70, 25);
        hat1.setColour(0, 100, 200); // Set hat color to blue
    }


    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        rec1.draw(g2);
        hat1.draw(g2);
      
        
    }
 
     
 }
 
 