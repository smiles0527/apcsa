package ShapeComponent;
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
	

    public ShapeComponent()
    {
        rec1= new Rectangle1();
       
    }


    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        rec1.draw(g2);
      
        
    }

    
}

