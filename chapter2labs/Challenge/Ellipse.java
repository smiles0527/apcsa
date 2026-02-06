package Chapter2Labs.Challenge;

import javax.swing.*;
import java.awt.*;

public class Ellipse extends JComponent
{
    private Color fill = new Color(120, 40, 200);

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        g2.setColor(fill);
        g2.fillOval(0, 0, w - 1, h - 1);

        g2.setColor(Color.black);
        g2.drawOval(0, 0, w - 1, h - 1);
    }
}
