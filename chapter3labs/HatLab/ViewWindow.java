package Chapter3Labs.HatLab;

import javax.swing.*;

@author Curtis Wei
@time 2026

public class ViewWindow
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hat Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        frame.add(new ShapeComponent());

        frame.setVisible(true);
    }
}
