package Chapter2;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * A viewer class for showing basic shapes
 * in order to learn about objects
 * @author Duncan Fraser
 * @version 2024
 */

public class ViewWindow 
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 600;
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Draw Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new ShapeComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}





