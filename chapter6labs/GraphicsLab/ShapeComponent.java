package Chapter6Labs/GraphicsLab;
import java.awt.*;
import javax.swing.JComponent;

public class ShapeComponent extends JComponent
{
    private static final int MODE = 1;

    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        if(MODE == 1) drawPyramid(g2d);
        else if(MODE == 2) drawGradientLines(g2d);
        else if(MODE == 3) drawCircles(g2d);
        else drawSinusoidal(g2d);
    }

    private void drawPyramid(Graphics2D g2d)
    {
        int count = 10;
        int maxSize = 400;
        int step = maxSize / count;

        int startX = 50;
        int startY = 50;

        for(int i = 0; i < count; i++)
        {
            int size = maxSize - i * step;

            int red = (int)(250.0 * i / (count - 1));
            Color c = new Color(red, 0, 0);

            if(i == 0) c = new Color(0, 0, 0);

            int x = startX + (maxSize - size) / 2;
            int y = startY + (maxSize - size) / 2;

            g2d.setColor(c);
            g2d.drawRect(x, y, size, size);
        }
    }

    private void drawGradientLines(Graphics2D g2d)
    {
        int w = 500;
        int h = 500;

        for(int i = 0; i < 500; i++)
        {
            int xTop = i;
            int yTop = 0;

            int xBot = w - 1 - i;
            int yBot = h - 1;

            int blue;
            if(i < 250) blue = i;
            else blue = 499 - i;

            g2d.setColor(new Color(0, 0, blue));
            g2d.drawLine(xTop, yTop, xBot, yBot);
        }
    }

    private void drawCircles(Graphics2D g2d)
    {
        int diameter = 100;
        int count = 10;

        int x = 50;
        int y = 200;

        int spacing = 40;

        Color c1 = Color.RED;
        Color c2 = Color.BLUE;

        Color current = c1;

        for(int i = 0; i < count; i++)
        {
            g2d.setColor(current);
            g2d.drawOval(x + i * spacing, y, diameter, diameter);

            if(current == c1) current = c2;
            else current = c1;
        }
    }

    private void drawSinusoidal(Graphics2D g2d)
    {
        g2d.setColor(Color.BLACK);

        int midY = 250;
        double amp = 100.0;
        double scale = 40.0;

        for(int x = 0; x < 500; x++)
        {
            double radians = x / scale;
            double yMath = amp * Math.sin(radians);

            int y = (int)(midY - yMath);

            g2d.fillOval(x, y, 5, 5);
        }
    }
}
