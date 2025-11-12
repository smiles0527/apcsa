import javax.swing.JFrame;

public class ViewWindow{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Shapes Lab - Rectangles and Circles");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapeComponent component = new ShapeComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}