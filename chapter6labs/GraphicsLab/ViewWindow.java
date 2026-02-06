package Chapter6Labs.GraphicsLab;
import javax.swing.JFrame;

public class ViewWindow
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("For Loop Graphics Lab");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapeComponent comp = new ShapeComponent();
        frame.add(comp);

        frame.setVisible(true);
    }
}
