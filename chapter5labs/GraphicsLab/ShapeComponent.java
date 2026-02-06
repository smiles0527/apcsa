package Chapter5Labs.GraphicsLab;
/**
 * A helper class for showing basic shapes using JComponent.
 * @author Duncan Fraser
 * @version 2 2024
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeComponent extends JComponent implements MouseListener
{
    int x = -100;
    int y = -100;

    int clickCount = 0;
    int size = 100;

    Color shapeColor = Color.RED;

    public ShapeComponent()
    {
        this.addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();

        clickCount++;

        int midX = 300;
        int midY = 300;

        if(x >= midX && y < midY)
        {
            shapeColor = Color.GREEN;
        }
        else if(x < midX && y < midY)
        {
            shapeColor = Color.BLUE;
        }
        else if(x < midX && y >= midY)
        {
            shapeColor = Color.CYAN;
        }
        else
        {
            shapeColor = Color.YELLOW;
        }

        if(clickCount % 5 == 0)
        {
            size += 20;
        }

        repaint();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(shapeColor);
        g2.fillOval(x, y, size, size);

        g2.setColor(Color.BLACK);
        g2.drawString("Clicks: " + clickCount, 20, 20);
    }
}
