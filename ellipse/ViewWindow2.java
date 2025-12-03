package ellipse;

import javax.swing.JFrame;

public class ViewWindow2{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Shapes Lab 2 - Triangles and Emojis");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapeComponent2 component = new ShapeComponent2();
        frame.add(component);
        frame.setVisible(true);
    }
}