package IfGraphics;

import javax.swing.JFrame;

public class ViewWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("IfGraphics Lab");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapeComponent component = new ShapeComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
