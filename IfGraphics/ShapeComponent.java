package IfGraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;

public class ShapeComponent extends JComponent implements MouseListener {
    private Point p;
    private Color shapeColor = Color.RED;
    private int clickCount = 0;

    public ShapeComponent() {
        this.addMouseListener(this);
        p = new Point(-100, -100); // Initialize off-screen
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {
        p.setLocation(e.getX(), e.getY());
        clickCount++;
        
        int x = p.getX();
        int y = p.getY();

        // Challenge 2: More conditions (Center Zone)
        // Center zone: 250 < x < 350 AND 250 < y < 350
        if (x > 250 && x < 350 && y > 250 && y < 350) {
            shapeColor = Color.MAGENTA;
        } else if (x > 300 && y < 300) {
            // Quadrant 1: Top Right
            shapeColor = Color.GREEN;
        } else if (x < 300 && y < 300) {
            // Quadrant 2: Top Left
            shapeColor = Color.BLUE;
        } else if (x < 300 && y > 300) {
            // Quadrant 3: Bottom Left
            shapeColor = Color.CYAN;
        } else if (x > 300 && y > 300) {
            // Quadrant 4: Bottom Right
            shapeColor = Color.YELLOW;
        } else {
            // On the lines
            shapeColor = Color.RED;
        }

        System.out.println("Click Count: " + clickCount);
        repaint();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(shapeColor);
        
        // Challenge 3: Use click count to change behavior (size)
        // Cycle sizes: 100, 110, 120, 130, 140, then back to 100
        int size = 100 + (clickCount % 5) * 10;
        
        // Center the oval on the click point
        g.fillOval(p.getX() - size/2, p.getY() - size/2, size, size);
    }
}
