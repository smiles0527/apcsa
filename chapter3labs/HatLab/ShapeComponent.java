package Chapter3Labs.HatLab;

import javax.swing.*;
import java.awt.*;

@author Curtis Wei
@time 2026

public class ShapeComponent extends JComponent
{
    private Hat hat;

    public ShapeComponent()
    {
        hat = new Hat(150, 120, 140, 90, 30, Color.blue);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        hat.draw(g2);
    }
}
