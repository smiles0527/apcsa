import javax.swing.JComponent;
import java.awt.*;

public class EllipseComponent extends JComponent{
    private Ellipse ellipse;

    public EllipseComponent(){
        // Create ellipse with your favorite color
        // Change the RGB values to your favorite color!
        ellipse = new Ellipse(0, 0, 400, 300, new Color(147, 51, 234));
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        // Get the current window size
        int windowWidth = getWidth();
        int windowHeight = getHeight();

        // Resize ellipse to fill the entire window
        ellipse.setPosition(0, 0);
        ellipse.setSize(windowWidth, windowHeight);

        // Draw the ellipse
        ellipse.draw(g2);
    }
}